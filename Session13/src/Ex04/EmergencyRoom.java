package Ex04;
import java.util.LinkedList;

public class EmergencyRoom {
    private LinkedList<String> queue= new LinkedList<>();
    void patientCheckin(String name){
        queue.addLast(name);
    }
    void emergencyCheckin(String name){
        queue.addFirst(name);
    }
    void treatPatient(){
        System.out.println(queue.getFirst());
       queue.removeFirst();
    }

    public static void main(String[] args) {
        EmergencyRoom a=new EmergencyRoom();
        a.patientCheckin("Quydzvcl");
        a.patientCheckin("Quydzvcl2");
        a.emergencyCheckin("Quydzvcl3");
        a.treatPatient();
        a.treatPatient();
        a.treatPatient();
    }
}
