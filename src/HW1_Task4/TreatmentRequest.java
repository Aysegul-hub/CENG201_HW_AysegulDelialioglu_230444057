// TreatmentRequest class
public class TreatmentRequest {
    int patientId; // patient id
    public long arrivalTime; // arrival time
    boolean isPriority; // priority

    public TreatmentRequest(int patientId, boolean isPriority) {
        this.patientId = patientId; // set id
        this.isPriority = isPriority; // set priority
        this.arrivalTime = System.currentTimeMillis(); // set time
    }

    @Override
    public String toString() {
        return "TreatmentRequest{" + "patientId=" + patientId + ", Priority=" + isPriority + '}' ; // return string
    }
}
