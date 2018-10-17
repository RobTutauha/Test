/**
 * .
 */
package hospitalrecords;

/**
 * Patient, stores and displays patient information.
 * @author Rob Tutauha
 */
public class Patient {
  /** Patient ID number */
  String patientID;
  
  /** Patient first and last name */
  String patientName;
  
  /** Patient date admitted to hospital */
  String patientCheckInDate;
  
  /** Patient assigned doctor(s) */
  String patientAssignedPersonnel;
  
  
  /**
  * Patient constructor.
  * @param iD - 1st index patient record
  * @param name - 2nd index patient record
  * @param checkIn - 3rd index patient record
  * @param personnel - 4th index patient record
  */
  public Patient(String iD, String name, String checkIn, String personnel) {
    this.patientID = iD;
    this.patientName = name;
    this.patientCheckInDate = checkIn;
    this.patientAssignedPersonnel = personnel;
  }
  
  
  /**
  * toString override for display of patient record data.
  * @return 
  */
  @Override
  public String toString() {
    return "\n\nPatient ID: " + patientID + "\nName: " + patientName + "\nCheck In Date: " + patientCheckInDate + "\nAssigned Medical Personnel: " + patientAssignedPersonnel;
  }

}
