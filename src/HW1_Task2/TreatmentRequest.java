

public class TreatmentRequest {
    int patientId; // id
    public long arrivalTime; // time
    boolean isPriority; // priority

    public TreatmentRequest(int patientId, boolean isPriority) {
        this.patientId = patientId;
        this.isPriority = isPriority;
        this.arrivalTime = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "TreatmentRequest{" + "patientId=" + patientId + ", Priority=" + isPriority + '}' ;
    }
}
