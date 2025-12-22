
import java.util.HashMap;

public class HospitalSystem { // This class manages the hospital system including patients , treatment queues and discharge stack.
    private final PatientList patientList;
    private final TreatmentQueue normalQueue;
    private final TreatmentQueue priorityQueue;
    private final DischargeStack dischargeStack;
    private final HashMap<Integer, Patient> patientMap;

    public HospitalSystem() { // Constructor to initialize the hospital system components.
        patientList = new PatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }

    public void addPatient(Patient patient) { // Add a new patient to the system.
        patientList.addPatient(patient);
        patientMap.put(patient.id,patient);
    }
    public void addTreatmentRequest( TreatmentRequest request) { // Add a treatment request to the appropriate queue based on priority.
        if ( request.isPriority) {
            priorityQueue.enqueue(request); // Add to priority queue.

        }
        else{
            normalQueue.enqueue(request);
        }

    }
    public void processTreatment() { // Process the next treatment request from the queues.
        TreatmentRequest request;
        if ( !priorityQueue.isEmpty()) {
            request = priorityQueue.dequeue();
        }else {
            request = normalQueue.dequeue();
        }
        if(request == null) {
            System.out.println("No Treatment Request to Process");
            return;
        }

        Patient patient = patientMap.get(request.patientId); // Find the patient by ID.

        if(patient != null) { // If patient exists , created a discharge record and remove the patient from the patient list.
            dischargeStack.push(new DischargeRecord(patient.id));
            patientList.removePatient(patient.id);

        }
    }

    public void printSystemState() { // Print the current state of the hospital system including patients , treatment queues and discharge stack.
        System.out.println("\n----- Admitted Patients -----");
        patientList.printList();
        System.out.println("\n----- Priority Treatment Queue -----");
        priorityQueue.printQueue();
        System.out.println("\n----- Normal Treatment Queue -----");
        normalQueue.printQueue();
        System.out.println("\n----- Discharge Stack -----");
        dischargeStack.printStack();
        

    }

    //Sorting by severity level in descending order (Bubble Sort).
    public void sortPatientsBySeverity() { // Sort patients by severity level in descending order.
        Patient[] arr = patientList.toArray();
        for ( int i = 0 ; i< arr.length - 1 ; i++){
            for ( int j = 0 ; j < arr.length - i - 1 ; j++) {
                if ( arr[j].severity < arr[j + 1].severity) {
                    Patient temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("\n-----Patients Sorted by Severity Level -----"); // Print sorted patients.
        for ( Patient p : arr){
            System.out.println(p);
        }
    
}
}
