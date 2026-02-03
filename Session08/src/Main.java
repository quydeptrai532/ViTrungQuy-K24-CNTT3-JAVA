import java.util.Scanner;

public class Main {

    // ===================== STUDENT =====================
    static class Student {
        private String id;
        private String name;
        private int age;
        private String gender;
        private double math, physics, chemistry;
        private double avg;
        private String rank;

        public Student(String id, String name, int age, String gender,
                       double math, double physics, double chemistry) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.math = math;
            this.physics = physics;
            this.chemistry = chemistry;
            calculate();
        }

        public void calculate() {
            avg = (math + physics + chemistry) / 3;
            if (avg >= 8 && math >= 6.5 && physics >= 6.5 && chemistry >= 6.5)
                rank = "Gioi";
            else if (avg >= 6.5 && math >= 5 && physics >= 5 && chemistry >= 5)
                rank = "Kha";
            else if (avg >= 5 && math >= 3.5 && physics >= 3.5 && chemistry >= 3.5)
                rank = "Trung binh";
            else
                rank = "Yeu";
        }

        public String getId() { return id; }
        public String getName() { return name; }
        public double getAvg() { return avg; }
        public String getRank() { return rank; }

        public void setName(String name) { this.name = name; }
        public void setAge(int age) { this.age = age; }

        public void setScores(double m, double p, double c) {
            math = m;
            physics = p;
            chemistry = c;
            calculate();
        }

        public void display() {
            System.out.printf("%-10s %-20s %-5d %-8s %-6.2f %-12s%n",
                    id, name, age, gender, avg, rank);
        }
    }

    // ===================== MANAGER =====================
    static class StudentManager {
        private Student[] list;
        private int size;

        public StudentManager(int capacity) {
            list = new Student[capacity];
            size = 0;
        }

        public boolean add(Student s) {
            if (size == list.length || findById(s.getId()) != -1)
                return false;
            list[size++] = s;
            return true;
        }

        public void displayAll() {
            if (size == 0) {
                System.out.println("Danh sach rong!");
                return;
            }
            System.out.printf("%-10s %-20s %-5s %-8s %-6s %-12s%n",
                    "MaSV", "Ho ten", "Tuoi", "GT", "DTB", "Xep loai");
            for (int i = 0; i < size; i++)
                list[i].display();
        }

        public int findById(String id) {
            for (int i = 0; i < size; i++)
                if (list[i].getId().equalsIgnoreCase(id))
                    return i;
            return -1;
        }

        public void findByName(String key) {
            boolean found = false;
            for (int i = 0; i < size; i++)
                if (list[i].getName().toLowerCase().contains(key.toLowerCase())) {
                    list[i].display();
                    found = true;
                }
            if (!found) System.out.println("Khong tim thay!");
        }

        public boolean update(String id, String name, int age,
                              double m, double p, double c) {
            int i = findById(id);
            if (i == -1) return false;
            list[i].setName(name);
            list[i].setAge(age);
            list[i].setScores(m, p, c);
            return true;
        }

        public boolean delete(String id) {
            int i = findById(id);
            if (i == -1) return false;
            for (int j = i; j < size - 1; j++)
                list[j] = list[j + 1];
            list[--size] = null;
            return true;
        }

        // Bubble sort theo DTB giam dan
        public void sortByAvg() {
            for (int i = 0; i < size - 1; i++)
                for (int j = 0; j < size - i - 1; j++)
                    if (list[j].getAvg() < list[j + 1].getAvg()) {
                        Student t = list[j];
                        list[j] = list[j + 1];
                        list[j + 1] = t;
                    }
        }

        public void statistic() {
            int gioi = 0, kha = 0, tb = 0, yeu = 0;
            double sum = 0;
            Student max = list[0], min = list[0];

            for (int i = 0; i < size; i++) {
                sum += list[i].getAvg();
                if (list[i].getAvg() > max.getAvg()) max = list[i];
                if (list[i].getAvg() < min.getAvg()) min = list[i];

                switch (list[i].getRank()) {
                    case "Gioi": gioi++; break;
                    case "Kha": kha++; break;
                    case "Trung binh": tb++; break;
                    default: yeu++;
                }
            }

            System.out.println("Gioi: " + gioi);
            System.out.println("Kha: " + kha);
            System.out.println("Trung binh: " + tb);
            System.out.println("Yeu: " + yeu);
            System.out.printf("DTB chung: %.2f%n", sum / size);
            System.out.print("Cao nhat: "); max.display();
            System.out.print("Thap nhat: "); min.display();
        }
    }

    // ===================== MAIN =====================
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager(100);
        int choice;

        do {
            System.out.println("\n===== QUAN LY SINH VIEN =====");
            System.out.println("1. Them");
            System.out.println("2. Hien thi");
            System.out.println("3. Tim kiem");
            System.out.println("4. Cap nhat");
            System.out.println("5. Xoa");
            System.out.println("6. Sap xep theo DTB");
            System.out.println("7. Thong ke");
            System.out.println("8. Thoat");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Ma SV: ");
                    String id = sc.nextLine();
                    System.out.print("Ten: ");
                    String name = sc.nextLine();
                    System.out.print("Tuoi: ");
                    int age = Integer.parseInt(sc.nextLine());
                    System.out.print("Gioi tinh: ");
                    String gt = sc.nextLine();
                    System.out.print("Toan Ly Hoa: ");
                    double m = sc.nextDouble();
                    double p = sc.nextDouble();
                    double c = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(manager.add(
                            new Student(id, name, age, gt, m, p, c))
                            ? "Them thanh cong" : "Them that bai");
                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    System.out.print("Nhap ten can tim: ");
                    manager.findByName(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Ma SV: ");
                    id = sc.nextLine();
                    System.out.print("Ten moi: ");
                    name = sc.nextLine();
                    System.out.print("Tuoi moi: ");
                    age = Integer.parseInt(sc.nextLine());
                    System.out.print("Toan Ly Hoa moi: ");
                    m = sc.nextDouble();
                    p = sc.nextDouble();
                    c = sc.nextDouble();
                    sc.nextLine();
                    System.out.println(manager.update(id, name, age, m, p, c)
                            ? "Cap nhat thanh cong" : "Khong tim thay");
                    break;

                case 5:
                    System.out.print("Ma SV: ");
                    System.out.println(manager.delete(sc.nextLine())
                            ? "Da xoa" : "Khong tim thay");
                    break;

                case 6:
                    manager.sortByAvg();
                    System.out.println("Da sap xep!");
                    break;

                case 7:
                    manager.statistic();
                    break;
            }
        } while (choice != 8);

        sc.close();
    }
}
