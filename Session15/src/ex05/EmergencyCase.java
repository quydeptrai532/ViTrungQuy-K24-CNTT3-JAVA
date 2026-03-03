package ex05;

import java.util.Stack;

public class EmergencyCase {

    private Patient patient;
    private Stack<TreatmentStep> steps = new Stack<>();

    public EmergencyCase(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    // Thêm bước xử lý (Push)
    public void addStep(TreatmentStep step) {
        steps.push(step);
        System.out.println("Da them buoc xu ly:");
        System.out.println(step);
    }

    // Undo bước gần nhất (Pop)
    public TreatmentStep undoStep() {
        if (steps.isEmpty()) {
            System.out.println("Khong co buoc nao de Undo!");
            return null;
        }

        TreatmentStep removed = steps.pop();
        System.out.println("Da Undo buoc:");
        System.out.println(removed);
        return removed;
    }

    // Hiển thị các bước (Top -> Bottom)
    public void displaySteps() {
        System.out.println("=== Cac buoc xu ly (Gan nhat -> Dau tien) ===");

        if (steps.isEmpty()) {
            System.out.println("Chua co buoc xu ly nao.");
        } else {
            for (int i = steps.size() - 1; i >= 0; i--) {
                System.out.println(steps.get(i));
            }
        }

        System.out.println("--------------------------------");
    }
}