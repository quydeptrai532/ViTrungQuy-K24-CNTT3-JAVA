package ex04;

public class EmergencyPatient {

    private String id;
    private String name;
    private int priority; // 1: cap cuu, 2: thuong

    public EmergencyPatient(String id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        String level = (priority == 1) ? "Cap cuu" : "Thong thuong";
        return "ID: " + id + " | Name: " + name + " | Muc do: " + level;
    }
}