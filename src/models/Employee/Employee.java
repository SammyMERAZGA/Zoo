package models.Employee;

public class Employee {

    // Properties
    private String name;
    private String sex;
    private byte age;

    public Employee(String name, String sex, byte age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public byte getAge() {
        return age;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(byte age) {
        this.age = age;
    }

}
