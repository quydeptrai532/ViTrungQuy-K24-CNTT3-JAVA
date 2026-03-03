package ex02;

import java.util.LinkedList;
import java.util.Queue;

public class PatientQueue {

    private Queue<ex02.Patient> queue = new LinkedList<>();

    // Thêm bệnh nhân (Enqueue)
    public void addPatient(Patient p) {
        queue.offer(p);
        System.out.println("Da them benh nhan:");
        System.out.println(p);
        displayQueue();
    }

    // Gọi bệnh nhân tiếp theo (Dequeue)
    public Patient callNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Khong con benh nhan nao trong hang doi!");
            return null;
        }

        Patient p = queue.poll();
        System.out.println("Dang kham benh nhan:");
        System.out.println(p);
        displayQueue();
        return p;
    }

    // Xem bệnh nhân tiếp theo (Peek)
    public Patient peekNextPatient() {
        if (queue.isEmpty()) {
            System.out.println("Hang doi rong!");
            return null;
        }
        return queue.peek();
    }

    // Kiểm tra rỗng
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Hiển thị danh sách chờ
    public void displayQueue() {
        System.out.println("=== Danh sach benh nhan dang cho (Front -> Rear) ===");

        if (queue.isEmpty()) {
            System.out.println("Hang doi rong.");
        } else {
            for (Patient p : queue) {
                System.out.println(p);
            }
        }
        System.out.println("--------------------------------------");
    }
}