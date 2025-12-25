// Patient class
public class Patient {
    public int id; // id
    public String name; // name
    public int severity; // severity 1-10
    public int age; // age

    public Patient(int id, String name, int severity , int age) {
        this.id = id; // set id
        this.name = name; // set name  
        this.severity = severity; // set severity
        this.age = age; // set age
    }

    @Override
    public String toString() {
        return "Patient { " + "id = " + id + " , name = " + name + ",severity = " + severity + ", age = " + age + "}";
    }
}