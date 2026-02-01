public class Ex01 {
    public static class Student{
        private String  studentId;
        private String name;
        private String dob;
        private double score;

        public Student(String studentId, String name, String dob, double score) {
            this.studentId = studentId;
            this.name = name;
            this.dob = dob;
            this.score = score;
        }
        void printInfo(){
            System.out.println("Ma Sv:"+this.studentId);
            System.out.println("Ten:"+this.name);
            System.out.println("Ngay Sinh:"+this.dob);
            System.out.println("Diem so:"+this.score);
        }
    }

    public static void main(String[] args) {
        Student st01=new Student( "B24DTCN11","Anh Quý Dai Cù","15/02/2003",9.5);
        Student st02=new Student( "B24DTCN12","Anh Quý Exciter ","15/02/2003",3.6);
        st01.printInfo();
        st02.printInfo();
    }
}
