package btth;

import java.util.*;

public class PatientManagement implements IManagement<Patient> {

    private LinkedList<Patient> waitingQueue = new LinkedList<>();

    // ADD
    @Override
    public void add(Patient p) {

        // Nếu là bệnh nhân cấp cứu → ưu tiên lên đầu
        if (p instanceof EmergencyPatient) {
            waitingQueue.addFirst(p);
        } else {
            waitingQueue.addLast(p);
        }

        System.out.println("Da them benh nhan vao hang doi.");
    }

    // DISPLAY
    @Override
    public void display() {

        if (waitingQueue.isEmpty()) {
            System.out.println("Hang doi rong.");
            return;
        }

        for (Patient p : waitingQueue) {
            p.showInfo();
        }
    }

    // SEARCH
    @Override
    public Patient search(String keyword) {

        for (Patient p : waitingQueue) {
            if (p.getId().equalsIgnoreCase(keyword)
                    || p.getFullName().equalsIgnoreCase(keyword)) {
                return p;
            }
        }
        return null;
    }

    // SORT (theo tuổi tăng dần)
    @Override
    public void sort() {
        waitingQueue.sort(Comparator.comparingInt(Person::getAge));
        System.out.println("Da sap xep theo tuoi tang dan.");
    }

    // Gọi khám (Dequeue)
    public Patient callPatient() {

        if (waitingQueue.isEmpty()) return null;

        return waitingQueue.removeFirst();
    }
}