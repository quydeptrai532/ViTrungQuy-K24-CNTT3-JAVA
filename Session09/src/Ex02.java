public class Ex02 {
    static class Animal{
        void sound(){
            System.out.println("Tiếng kêu");
        }
    }
    static class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Gau Gau");
        }
    }

    static class Cat extends Animal{

        @Override
        void sound(){
            System.out.println("Meo Meo");
        }
    }

    public static void main(String[] args) {
        Cat cat1=new Cat();
        Dog dog1=new Dog();
        cat1.sound();
        dog1.sound();
    }
}
