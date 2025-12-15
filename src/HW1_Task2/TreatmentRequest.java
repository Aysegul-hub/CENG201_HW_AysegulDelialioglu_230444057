package HW1_Task2;

public class TreatmentRequest { //This class shows a treatment request by a patient.

    private final int patientId;// We write final because these values should not be changed after initialization.
    private final long arrivalTime;

    public TreatmentRequest(int patientId) { //Constructor 
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();
    }

    public int getPatientId() { // Getter method for patientId.
        return patientId;

    }

    public long getArrivalTime() { // Getter method for arrivalTime.
        return arrivalTime;
    }

    @Override // This is important for clean output when printing the object.

    public String toString() { //Provide a string representation.
        return "TreatmentRequest{" + "patientId=" + patientId + ", arrivalTime=" + arrivalTime + '}' ;
    }
    
}
