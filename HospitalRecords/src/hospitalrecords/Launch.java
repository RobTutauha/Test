/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalrecords;

import java.util.Scanner;

/**
 * Launch, runs main method.
 * @author Rob Tutauha
 */
public class Launch {
  
  
  /**
  * main method obtains records by calling obtainRecords() with path, loops
  * user input options to search and delete records and provides exit option.
  * @param args
  */
  public static void main(String[] args) {
    
    // Instatiate new hospital record.
    HospitalRecords hospital = new HospitalRecords();
    // Obtain records and put into patientRecod array.
    hospital.obtainRecords("W:\\IT6033\\NetBeansProjects\\Test\\HospitalRecords\\records\\ListOfPatients.txt");
    // While loop controller.
    boolean wait = true;
    // Control for when no records are found on search.
    boolean noRecord = true;
    // While loop UI.
    while (wait == true) {
      // User input to search or exit and put choice into char variable.
      System.out.println("\nPress S to search or E to exit: ");
      Scanner option = new Scanner(System.in);
      char selection = option.next().charAt(0);
      // Analyse choice.
      switch (selection) {
        case 'S':
          // User input to search by patient ID number and
          // put into string variable.
          System.out.println("Enter Patient ID: ");
          Scanner search = new Scanner(System.in);
          String searchID = search.nextLine();
          System.out.println("\n\nSearching Patient ID " + searchID);
          // Search and result return block.
          for (Patient i : hospital.patientRecord) {
            System.out.println("Found " + i.patientID);
            // Displays result if result is found.
            if (i.patientID.equals(searchID)) {
              noRecord = false;
              System.out.println("\nPatient record found.");
              System.out.println(i);
              // Patient record deletion controller.
              String deleter = "";
              // Delete patient record UI loop.
              while (true) {
                System.out.println("\nDelete Patient Record? Press Y or N:");
                Scanner deleteOption = new Scanner(System.in);
                String deleteSelection = deleteOption.next();
                if ("Y".equals(deleteSelection)) {
                  deleter = deleteSelection;
                  break;
                } else if ("N".equals(deleteSelection)) {
                  break;
                } else {
                  System.out.println("\nSorry please try again.");
                }
              }
              // Delete patient record.
              if ("Y".equals(deleter)) {
                hospital.patientRecord.remove(hospital.patientRecord.indexOf(i));
                System.out.println("Patient deleted.");
                break;
              }
              if ("N".equals(deleter)) {
                break;
              }
            }
            else {
              noRecord = true;
              continue;
            }
            break;
          }
          if (noRecord == true) {
            System.out.println("\nNo Record.");
          }
          break;
        case 'E':
          System.out.println("\nAlrighty then, byebye now.");
          wait = false;
          break;
        default:
          System.out.println("\nSorry I didn't catch that.");
      }
    }
  }
}
