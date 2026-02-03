import java.util.Scanner;

public class KT {

    static Scanner sc = new Scanner(System.in);
    static class Student{
        private String studentId;
        private String studentName;
        private double score;

        public Student(String studentId, String studentName, double score) {
            this.studentId = studentId;
            this.studentName = studentName;
            this.score = score;
        }

        public Student() {
            this.studentId = "Chưa khởi tạo";
            this.studentName = "Chưa khởi tạo";
            this.score = 0.0;
        }

        public String getStudentId() {
            return studentId;
        }

        public String getStudentName() {
            return studentName;
        }

        public double getScore() {
            return score;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String getRank() {
            if (score >= 8.0) {
                return "Gioi";
            } else if (score >= 6.5) {
                return "Kha";
            } else {
                return "Trung Binh";
            }
        }

        public String toStrings(){
            return "MaSv:" + this.studentId + " TenSv:" + this.studentName + " Diem:" + this.score + " Hoc luc:" + this.getRank();
        }
    }

    //Chuc nang 1
    static int insertStudents(Student[] arr, int count) {
        System.out.print("Nhap so luong sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap sinh vien thu " + (count + 1));

            String id;
            while (true) {
                System.out.print("Nhap ma SV (vd: SV001): ");
                id = sc.nextLine();
                if (checkStudentId(id)) break;
                System.out.println("Ma SV khong hop le");
            }

            System.out.print("Nhap ho ten: ");
            String name = sc.nextLine();

            System.out.print("Nhap diem trung binh: ");
            double score = sc.nextDouble();
            sc.nextLine();

            arr[count] = new Student(id, name, score);
            count++;
        }
        return count;
    }

    //  Validate mã SV
    static boolean checkStudentId(String id) {
        if (!id.startsWith("SV") || id.length() != 5) return false;
        for (int i = 2; i < 5; i++) {
            if (!Character.isDigit(id.charAt(i))) return false;
        }
        return true;
    }

    //Chuc nang 2
    static void displayStudents(Student[] arr,int count){
        if(count == 0){
            System.out.println("Danh sach rong");
        } else {
            for (int i = 0; i < count; i++){
                System.out.println(arr[i].toStrings());
            }
        }
    }

    //Chuc nang 3
    static void findStudent(Student[] arr, int count) {
        System.out.print("Nhap hoc luc can tim (Gioi/Kha/Trung Binh): ");
        String rank = sc.nextLine();

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (arr[i].getRank().equalsIgnoreCase(rank)) {
                System.out.println(arr[i].toStrings());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay sinh vien nao!");
        }
    }

    //Chuc nang 4
    static void bubleSort(Student[] arr, int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i].getScore() < arr[j].getScore()) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Student[] students = new Student[100];
        int count = 0;
        int choice;

        do {
            System.out.println("===== QUAN LY DIEM SINH VIEN =====");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Hien thi danh sach sinh vien");
            System.out.println("3. Tim kiem sinh vien theo hoc luc");
            System.out.println("4. Sap xep theo hoc luc giam dan");
            System.out.println("5. Thoat");
            System.out.println("=================================");
            System.out.print("Chon chuc nang: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    count = insertStudents(students, count);
                    break;
                case 2:
                    displayStudents(students, count);
                    break;
                case 3:
                    findStudent(students, count);
                    break;
                case 4:
                    bubleSort(students, count);
                    System.out.println("Da sap xep xong!");
                    displayStudents(students, count);
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 5);
    }
}
