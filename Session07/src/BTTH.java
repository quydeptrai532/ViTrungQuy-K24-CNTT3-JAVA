public class BTTH {
    static class Student{
        private String  studentId;
        private String studentName;
        private static final String schoolName="Quydz_academy";
        private static int studentCount=0;

        public Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
            studentCount++;
        }

        void displayInfo(){
            System.out.println(" MaSV:" + this.studentId+" TenSV:" + this.studentName);
        }

        static void showTotalStudent(){
            System.out.println("Ten Truong:" +schoolName+" - So luong Sv:"+studentCount);
        }
    }

    public static void main(String[] args) {
        Student sv01=new Student("SV001","Quydz");
        Student sv02=new Student("SV002","Quydz2");
        sv01.displayInfo();
        sv02.displayInfo();
        Student.showTotalStudent();
    }
}
