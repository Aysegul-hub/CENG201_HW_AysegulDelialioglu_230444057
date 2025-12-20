
import java.util.HashMap;

public class HospitalSystem {
    private final PatientList patientList;
    private final TreatmentQueue normalQueue;
    private final TreatmentQueue priorityQueue;
    private final DischargeStack dischargeStack;
    private final HashMap<Integer, Patient> patientMap;

    public HospitalSystem() {
        patientList = new PatientList();
        normalQueue = new TreatmentQueue();
        priorityQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientMap = new HashMap<>();
    }

    public void addPatient(Patient patient) {
        patientList.addPatient(patient);
        patientMap.put(patient.id,patient);
    }
    public void addTreatmentRequest( TreatmentRequest request) {
        if ( request.isPriority) {
            priorityQueue.enqueue(request);

        }
        else{
            normalQueue.enqueue(request);
        }

    }
    public void processTreatment() {
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

        Patient patient = patientMap.get(request.patientId);

        if(patient != null) {
            dischargeStack.push(new DischargeRecord(patient.id));
            patientList.removePatient(patient.id);

        }
    }

    public void printSystemState() {
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
    public void sortPatientsBySeverity() {
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

        System.out.println("\n-----Patients Sorted by Severity Level -----");
        for ( Patient p : arr){
            System.out.println(p);
        }
    
}
}
