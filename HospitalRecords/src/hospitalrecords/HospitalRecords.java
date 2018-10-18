/**
 * Task 1 Analysis
 * 
 * ArrayList is a suitable data structure for this purpose because the size
 * does not need to be defined prior to instantiation which provides flexibility
 * for loading various data files.
 * 
 * A multi-dimensional array could also do the job but would require complicated
 * coding to make it work as well as an ArrayList.
 */

package hospitalrecords;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

/**
 * HospitalRecords, imports and stores Patient records.
 * @author Rob Tutauha
 */
public class HospitalRecords {
  
  /** Patient record data list */
  ArrayList<Patient> patientRecord = new ArrayList<>();
  
  
  /**
  * obtainRecords(path) is called from the Launch class and attempts to 
  * add patient data to Array list patientRecord from a text file.
  * @param path required to find file - supplied by Launch class.
  */
  public void obtainRecords(String path) {

    LineNumberReader lr = null;
    String[] oneRecord = new String[4];
    //an array to store info about one patient
    Patient pat;
    System.out.println("Loading Patient Records...");
    try {
      //using try-catch for exception handling to catch
      //possible errors with i/o operations
      FileReader inputStream = new FileReader(path);
      //FileReader reads the file’s contents
      lr = new LineNumberReader(inputStream);
      String str;
      while ((str = lr.readLine()) != null) {
        //while the next line exists
        oneRecord = str.split(",");
        //dividing one file line by commas and assigning to array
        pat = new Patient(oneRecord[0], oneRecord[1], oneRecord[2], oneRecord[3]);
        patientRecord.add(pat);
        System.out.println("Patient Record Loaded...");
      }
    } catch (IOException ioe) {
      System.out.println(ioe.getMessage());
    }
    System.out.println("All Patient Records Loaded Successfully.\n");
  }
}
