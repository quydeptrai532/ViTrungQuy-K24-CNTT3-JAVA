package ex04;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyQueue {

    private Queue<EmergencyPatient> emergencyQueue = new LinkedList<>();
    private Queue<EmergencyPatient> normalQueue = new LinkedList<>();

    // Thêm bệnh nhân
    public void addPatient(EmergencyPatient p) {

        if (p.getPriority() == 1) {
            emergencyQueue.offer(p);
            System.out.println("Da them benh nhan CAP CUU:");
        } else {
            normalQueue.offer(p);
            System.out.println("Da them benh nhan THONG THUONG:");
        }

        System.out.println(p);
        displayQueue();
    }

    // Gọi bệnh nhân tiếp theo
    public EmergencyPatient callNextPatient() {

        EmergencyPatient next = null;

        if (!emergencyQueue.isEmpty()) {
            next = emergencyQueue.poll();
        } else if (!normalQueue.isEmpty()) {
            next = normalQueue.poll();
        } else {
            System.out.println("Khong con benh nhan nao!");
            return null;
        }

        System.out.println("Dang kham:");
        System.out.println(next);
        displayQueue();
        return next;
    }

    // Hiển thị danh sách chờ
    public void displayQueue() {

        System.out.println("=== DANH SACH CHO ===");

        System.out.println("-- Cap cuu --");
        if (emergencyQueue.isEmpty()) {
            System.out.println("Khong co.");
        } else {
            for (EmergencyPatient p : emergencyQueue) {
                System.out.println(p);
            }
        }

        System.out.println("-- Thong thuong --");
        if (normalQueue.isEmpty()) {
            System.out.println("Khong co.");
        } else {
            for (EmergencyPatient p : normalQueue) {
                System.out.println(p);
            }
        }

        System.out.println("--------------------------------");
    }
}