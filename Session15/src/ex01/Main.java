package ex01;

public class Main {
    public static void main(String[] args) {

        MedicalRecordHistory history = new MedicalRecordHistory();

        history.addEdit(new EditAction("Them chan doan viem hong", "10:00"));
        history.addEdit(new EditAction("Cap nhat don thuoc Paracetamol", "10:15"));
        history.addEdit(new EditAction("Them ket qua xet nghiem", "10:30"));

        System.out.println("\nChinh sua gan nhat:");
        System.out.println(history.getLatestEdit());

        System.out.println("\nThuc hien Undo:");
        history.undoEdit();

        System.out.println("\nChinh sua gan nhat sau Undo:");
        System.out.println(history.getLatestEdit());
    }
}