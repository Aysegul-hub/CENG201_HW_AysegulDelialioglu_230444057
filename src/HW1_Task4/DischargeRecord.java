
// DischargeRecord class
public class DischargeRecord {
    int patientIdentifier; // patient id
    long dischargeDate; // date

    public DischargeRecord(int patientIdentifier) {
        this.patientIdentifier = patientIdentifier; // set id
        this.dischargeDate = System.currentTimeMillis(); // set date
    }
    
    @Override
    public String toString() {
        return "Patient Identifier: " + patientIdentifier + " ,Discharge Time : " + dischargeDate; // return string
    }
}

