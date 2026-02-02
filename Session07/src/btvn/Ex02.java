package btvn;

public class Ex02 {
    static class Student{
        String name;

        public Student(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        int a=10;
        int b=a;
        a=20;
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        Student sv01=new Student("Huy");
        Student sv02=sv01;
        sv02.name="Quydz";
        System.out.println("sv1.name = " + sv01.name); // Thanh
        System.out.println("sv2.name = " + sv02.name);
    }
}
