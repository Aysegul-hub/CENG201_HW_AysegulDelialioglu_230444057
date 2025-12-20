

public class Task4Test {

    public static void main(String[] args) {

        HospitalSystem hpSystem = new HospitalSystem(); // Created a hospital system.

        hpSystem.addPatient(new Patient(1, "Ayşe", 5, 30)); // Adding 10 patient with varying severity levels and ages.
        hpSystem.addPatient(new Patient(2, "Emir", 9, 45));
        hpSystem.addPatient(new Patient(3, "Naz", 3, 22));
        hpSystem.addPatient(new Patient(4, "Hakan", 8, 60));
        hpSystem.addPatient(new Patient(5, "Seren", 4, 28));
        hpSystem.addPatient(new Patient(6, "Tufan", 7, 35));
        hpSystem.addPatient(new Patient(7, "Leyla", 6, 40));
        hpSystem.addPatient(new Patient(8, "Mehmet", 2, 19));
        hpSystem.addPatient(new Patient(9, "Asya", 10, 50));
        hpSystem.addPatient(new Patient(10, "Burak", 1, 26));

        hpSystem.addTreatmentRequest(new TreatmentRequest(1,false)); // Adding treatment requests with varying priority.
        hpSystem.addTreatmentRequest(new TreatmentRequest(2,true));
        hpSystem.addTreatmentRequest(new TreatmentRequest(3,false));
        hpSystem.addTreatmentRequest(new TreatmentRequest(4,true));
        hpSystem.addTreatmentRequest(new TreatmentRequest(5,false));
        hpSystem.addTreatmentRequest(new TreatmentRequest(6,false));
        hpSystem.addTreatmentRequest(new TreatmentRequest(7,true));
        hpSystem.addTreatmentRequest(new TreatmentRequest(8,false));



        hpSystem.processTreatment(); // Process 3 treatment requests.
        hpSystem.processTreatment();
        hpSystem.processTreatment();
        hpSystem.processTreatment();

        hpSystem.printSystemState(); // Print the current state of the hospital system.
        hpSystem.sortPatientsBySeverity(); // Sort and print patient by severity level.


    }
    
}
