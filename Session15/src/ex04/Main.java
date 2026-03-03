package ex04;

public class Main {
    public static void main(String[] args) {

        EmergencyQueue queue = new EmergencyQueue();

        queue.addPatient(new EmergencyPatient("BN01", "Nguyen Van A", 2));
        queue.addPatient(new EmergencyPatient("BN02", "Tran Thi B", 1));
        queue.addPatient(new EmergencyPatient("BN03", "Le Van C", 2));
        queue.addPatient(new EmergencyPatient("BN04", "Pham Thi D", 1));

        System.out.println("\nGoi kham lan 1:");
        queue.callNextPatient();

        System.out.println("\nGoi kham lan 2:");
        queue.callNextPatient();
    }
}