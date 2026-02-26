package Ex05;

public class Patient {
    private String id;
    private String fullname;
    private int age;
    private String diagnosis;

    public Patient(String id, String fullname, int age, String diagnosis) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public int getAge() {
        return age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Ten: " + fullname +
                ", Tuoi: " + age +
                ", Chan doan: " + diagnosis;
    }
}