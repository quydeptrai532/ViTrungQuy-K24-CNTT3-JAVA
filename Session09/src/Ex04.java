public class Ex04 {

    static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks: Gau Gau");
        }
        // Phương thức RIÊNG của Dog
        void guardHouse() {
            System.out.println("Dog is guarding the house");
        }
    }

    public static void main(String[] args) {
        // 1 Khai báo đa hình
        Animal animal = new Dog();
        // 2️ Gọi phương thức chung
        animal.sound();
        // 3️Thử gọi phương thức riêng của Dog
        // animal.guardHouse(); //  LỖI BIÊN DỊCH
        //  Downcasting an toàn
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal; // ép kiểu
            dog.guardHouse();
        }
    }
}
