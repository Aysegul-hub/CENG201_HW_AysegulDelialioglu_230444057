

public class TreatmentRequest { //This class shows a treatment request by a patient.

    int patientId;// We write final because these values should not be changed after initialization.
    public long arrivalTime;
    boolean isPriority;

    public TreatmentRequest(int patientId, boolean isPriority) { //Constructor 
        this.patientId = patientId;
        this.isPriority = isPriority;
        this.arrivalTime = System.currentTimeMillis();
    }

    @Override // This is important for clean output when printing the object.

    public String toString() { //Provide a string representation.
        return "TreatmentRequest{" + "patientId=" + patientId + ", Priority=" + isPriority + '}' ;
    }
    
}
