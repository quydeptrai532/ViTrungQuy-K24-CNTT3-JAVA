package ex06;

public class Patient {
    private String name;
    private int age;
    private String department;

    public Patient(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return name + " (" + age + " tuổi)";
    }
}