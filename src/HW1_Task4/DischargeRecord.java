

public class DischargeRecord { // This class keep just data about patient's discharge.
    int patientIdentifier; // The unique ID of patients
    long dischargeDate; // The discharge date of patients

    public DischargeRecord(int patientIdentifier) { // Parameterized constructor for setting patient ID and discharge date
        this.patientIdentifier = patientIdentifier;
        this.dischargeDate = System.currentTimeMillis(); // Setting discharge date to current time
    }
    
    @Override
    public String toString() { // Print discharge recorded information
        return "Patient Identifier: " + patientIdentifier + " ,Discharge Time : " + dischargeDate;

    }



    
}
