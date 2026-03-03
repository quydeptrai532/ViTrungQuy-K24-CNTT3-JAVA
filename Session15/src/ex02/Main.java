package ex02;

public class Main {
    public static void main(String[] args) {

        PatientQueue patientQueue = new PatientQueue();

        patientQueue.addPatient(new Patient("BN01", "Nguyen Van A", 25));
        patientQueue.addPatient(new Patient("BN02", "Tran Thi B", 30));
        patientQueue.addPatient(new Patient("BN03", "Le Van C", 40));

        System.out.println("\nBenh nhan tiep theo se duoc kham:");
        System.out.println(patientQueue.peekNextPatient());

        System.out.println("\nGoi kham:");
        patientQueue.callNextPatient();

        System.out.println("\nBenh nhan tiep theo sau khi goi:");
        System.out.println(patientQueue.peekNextPatient());
    }
}