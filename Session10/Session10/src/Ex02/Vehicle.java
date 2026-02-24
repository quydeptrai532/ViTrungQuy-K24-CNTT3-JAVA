package Ex02;

public abstract class Vehicle {

    protected String brand;   // cho lớp con truy cập

    // Constructor của abstract class
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // phương thức trừu tượng
    public abstract void move();
}