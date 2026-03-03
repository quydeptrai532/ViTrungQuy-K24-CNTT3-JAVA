package ex06;

import java.util.LinkedList;
import java.util.Queue;

public class PatientWaitingQueue {

    private Queue<Patient> waitingQueue = new LinkedList<>();
    private int totalPatients = 0;

    public void addPatient(Patient p) {
        waitingQueue.offer(p);
        totalPatients++;
    }

    public Patient callNext() {
        if (waitingQueue.isEmpty()) return null;
        totalPatients--;
        return waitingQueue.poll();
    }

    public int getTotalPatients() {
        return totalPatients;
    }
}