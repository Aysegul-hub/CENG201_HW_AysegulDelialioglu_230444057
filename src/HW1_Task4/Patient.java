public class Patient {

    // We explained the attiributes the patients. We use final keyword to make them immutable.
    public int id;
    public String name;
    public int severity;
    public int age;

    public Patient(int id, String name, int severity , int age) {
        this.id = id;
        this.name = name;
        this.severity = severity;
        this.age = age;

    }

    public int getId() { // We call getter method to reach the patient ID.
        return id;
    }

    // We use toString method to print the patient details , this way looks more organized.
    @Override //Provide a string representation of the patient object.
    public String toString() {
        return "Patient { " + "id = " + id + " , name = " + name + ",severity = " + severity + ", age = " + age + "}";

    }

   
    
}
