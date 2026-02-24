package Ex04;

public interface RemoteControl {

    void powerOn();   // phương thức trừu tượng

    // default method (Java 8+)
    default void checkBattery() {
        System.out.println("Pin ổn định");
    }
}