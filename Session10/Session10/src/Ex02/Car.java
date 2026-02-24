package Ex02;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);   // gọi constructor lớp cha
    }

    @Override
    public void move() {
        System.out.println(brand + " - Cách di chuyển: Di chuyển bằng động cơ");
    }
}