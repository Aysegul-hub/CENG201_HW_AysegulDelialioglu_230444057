// Test class for Task 1
public class Task1Test {
    public static void main ( String[] args) {
        PatientList list = new PatientList(); // create list

        list.addPatient(new Patient(1 , "Ali Murat Budak" , 5 , 30)); // add patient
        list.addPatient(new Patient(2 , "Leyla Parlak" , 8 , 18)); // add patient
        list.addPatient(new Patient(3 , "Tahir Aslan" , 3 , 25)); // add patient
        list.addPatient(new Patient(4 , "Mehtap Ece Şafak" , 6 , 45)); // add patient
        list.addPatient(new Patient(5 , "Hakan Çavuş" , 9 , 60)); // add patient

        System.out.println("Patient list after adding patients: "); // print message
        list.printList(); // print list

        list.removePatientById(3); // remove id 3
        System.out.println("\nAfter removing patient using by ID 3 : "); // message
        list.printList(); // print again

        System.out.println("\nSearching for patient with ID 4: "); // search message
        System.out.println(list.findPatientList(4)); // find and print

    }
    
}