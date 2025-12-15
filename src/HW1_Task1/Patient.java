public class Patient {

    // We explained the attiributes the patients. We use final keyword to make them immutable.
    private final int id;
    private final String name;
    private final int severityLevel;
    private final int age;

    public Patient(int id, String name, int severityLevel , int age) {
        this.id = id;
        this.name = name;
        this.severityLevel = severityLevel;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    // We use toString method to print the patient details , this way looks more organized.
    @Override //Provide a string representation of the patient object.
    public String toString() {
        return "Patient { " + "id = " + id + " , name = " + name + ",severityLevel = " + severityLevel + ", age = " + age + "}";

    }

   
    
}
