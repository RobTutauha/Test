/**
 * Task 3 Analysis
 * 
 * Queue, as an interface of LinkedList, is by far the best data structure type
 * for this particular application. One could almost say this simulation
 * exercise was made for it. Any other approach would be cumbersome with the
 * exception of a custom List interface that closely resembles Queue.
 */

package ticketingsystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TicketingSystem, simulates ticketing system.
 *
 * @author Rob Tutauha
 */
public class TicketingSystem {

  static Queue<Integer> customerQueue = new LinkedList<>();
  static int customer = 1;
  
  
  /**
   *
   * @param args
   */
  public static void main(String[] args) {

    Timer salesTimer = new Timer();
    salesTimer.schedule(new SalesAssisstantTask(), 0, 5000); //run code in the SalesAssistantTask run() method every 5 seconds

    Timer punterTimer = new Timer();
    punterTimer.schedule(new CustomerTask(), 0, 3000); //run code in the SalesAssistantTask run() method every 3 seconds
  }
  
  
  /**
   * SalesAssisstantTask, simulates sales assistant and customer processing.
   *
   * @author Rob Tutauha
   */
  private static class SalesAssisstantTask extends TimerTask {

    @Override
    public void run() {
      System.out.println("\nSales Assistant is ready to see the next customer.");
      
      // Queue simulation determinator.
      if (customerQueue.peek() == null) {
        System.out.println("There are no customers to see.");
      } else {
        int ticketNumber = customerQueue.poll();
        System.out.println("Customer with Ticket " + ticketNumber + " will be seen.");
        System.out.println("Customers with the following tickets are still queued: " + customerQueue);
      }
    }
  }

  
  /**
   * CustomerTask, simulates customers.
   *
   * @author Rob Tutauha
   */
  private static class CustomerTask extends TimerTask {
    
    /**
    * run override for customer simulation.
    */
    @Override
    public void run() {

      customerQueue.add(customer);
      System.out.println("\nCustomer with ticket " + customer + " has been added to the queue.");
      customer++;

    }
  }
}
