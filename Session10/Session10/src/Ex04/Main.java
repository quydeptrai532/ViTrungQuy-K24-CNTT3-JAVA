package Ex04;

public class Main {

    public static void main(String[] args) {

        // Anonymous Class
        RemoteControl smartLight = new RemoteControl() {

            @Override
            public void powerOn() {
                System.out.println("Đèn đã bật");
            }
        };

        smartLight.powerOn();
        smartLight.checkBattery();   // gọi default method
    }
}