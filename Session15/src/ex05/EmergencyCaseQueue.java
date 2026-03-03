package ex05;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyCaseQueue {

    private Queue<EmergencyCase> cases = new LinkedList<>();

    // Thêm ca bệnh (Enqueue)
    public void addCase(EmergencyCase c) {
        cases.offer(c);
        System.out.println("Da tiep nhan ca benh:");
        System.out.println(c.getPatient());
        displayQueue();
    }

    // Lấy ca tiếp theo (Dequeue)
    public EmergencyCase getNextCase() {
        if (cases.isEmpty()) {
            System.out.println("Khong con ca benh nao!");
            return null;
        }

        EmergencyCase next = cases.poll();
        System.out.println("Dang xu ly ca benh:");
        System.out.println(next.getPatient());
        displayQueue();
        return next;
    }

    public void displayQueue() {
        System.out.println("=== Hang doi cap cuu (Front -> Rear) ===");

        if (cases.isEmpty()) {
            System.out.println("Hang doi rong.");
        } else {
            for (EmergencyCase c : cases) {
                System.out.println(c.getPatient());
            }
        }

        System.out.println("--------------------------------");
    }
}