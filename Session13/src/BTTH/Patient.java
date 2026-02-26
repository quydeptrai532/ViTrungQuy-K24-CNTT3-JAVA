package BTTH;

public class Patient {
    protected int id;
    protected String name;
    protected int age;
    protected String sex;
    protected String sick;

    public Patient(int id, String name, int age, String sex, String sick) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.sick = sick;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getSick() {
        return sick;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }
}
