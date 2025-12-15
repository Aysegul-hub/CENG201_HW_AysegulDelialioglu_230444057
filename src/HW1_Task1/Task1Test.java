public class Task1Test {
    public static void main ( String[] args) {
        PatientList list = new PatientList();

        list.addPatient(new Patient(1 , "Ali Murat Budak" , 5 , 30));
        list.addPatient(new Patient(2 , "Leyla Parlak" , 8 , 18));
        list.addPatient(new Patient(3 , "Tahir Aslan" , 3 , 25));
        list.addPatient(new Patient(4 , "Mehtap Ece Şafak" , 6 , 45));
        list.addPatient(new Patient(5 , "Hakan Çavuş" , 9 , 60));

        System.out.println("Patient list after adding patients: ");
        list.printList();

        list.removePatientById(3); // Remove patient with ID 3 (Tahir Aslan).
        System.out.println("\nAfter removing patient using by ID 3 : ");
        list.printList();

        System.out.println("\nSearching for patient with ID 4: "); //
        System.out.println(list.findPatientList(4)); 

    }
    
}
