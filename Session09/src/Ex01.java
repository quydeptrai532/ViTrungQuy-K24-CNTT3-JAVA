public class Ex01 {

    static class Person {
        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayInfo() {
            System.out.println("Ten: " + name);
            System.out.println("Tuoi: " + age);
        }
    }

    static class Student extends Person {
        private String studentId;
        private double gpa;

        public Student(String name, int age, String studentId, double gpa) {
            super(name, age); // gọi constructor Person
            this.studentId = studentId;
            this.gpa = gpa;
        }

        @Override
        void displayInfo() {
            super.displayInfo();
            System.out.println("Ma SV: " + studentId);
            System.out.println("Diem TB: " + gpa);
        }
    }
    public static void main(String[] args) {
        Student s = new Student("Nguyen Van A", 20, "SV001", 8.5);
        s.displayInfo();
    }
}
