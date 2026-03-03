package btth;

public class EmergencyPatient extends Patient {

    private int priorityLevel; // 1 cao nhat

    public EmergencyPatient(String id, String fullName, int age,
                            String medicalCondition, int priorityLevel) {
        super(id, fullName, age, medicalCondition);
        this.priorityLevel = priorityLevel;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    @Override
    public void showInfo() {
        System.out.println(id + " | " + fullName + " | Age: " + age +
                " | Cap cuu (Priority: " + priorityLevel + ")");
    }
}