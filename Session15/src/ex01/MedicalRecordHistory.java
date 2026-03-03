package ex01;

import java.util.Stack;

public class MedicalRecordHistory {

    private Stack<EditAction> history = new Stack<>();

    // Push
    public void addEdit(EditAction action) {
        history.push(action);
        System.out.println("Da them chinh sua:");
        System.out.println(action);
        displayHistory();
    }

    // Pop (Undo)
    public EditAction undoEdit() {
        if (history.isEmpty()) {
            System.out.println("Khong co chinh sua de Undo!");
            return null;
        }

        EditAction removed = history.pop();
        System.out.println("Da Undo:");
        System.out.println(removed);
        displayHistory();
        return removed;
    }

    // Peek
    public EditAction getLatestEdit() {
        if (history.isEmpty()) {
            System.out.println("Stack rong!");
            return null;
        }
        return history.peek();
    }

    // Check empty
    public boolean isEmpty() {
        return history.isEmpty();
    }

    // Hiển thị Stack
    public void displayHistory() {
        System.out.println("=== Lich su chinh sua (Top -> Bottom) ===");

        if (history.isEmpty()) {
            System.out.println("Stack rong.");
        } else {
            for (int i = history.size() - 1; i >= 0; i--) {
                System.out.println(history.get(i));
            }
        }
        System.out.println("----------------------------------");
    }
}