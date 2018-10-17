/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketingsystem;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

public class TicketingSystem1 {

  //hello
  public SalesAssisstantTask assistant = new SalesAssisstantTask();
  public CustomerTask customers = new CustomerTask();
  Queue<Integer> customerQueue = new LinkedList<>();
  int customer = 1;

  public static void main(String[] args) {

    TicketingSystem1 office = new TicketingSystem1();

    Timer salesTimer = new Timer();
    salesTimer.schedule(office.assistant, 0, 5000); //run code in the SalesAssistantTask run() method every 5 seconds

    Timer punterTimer = new Timer();
    punterTimer.schedule(office.customers, 0, 3000); //run code in the SalesAssistantTask run() method every 5 seconds

  }

  private class SalesAssisstantTask extends TimerTask { //inner class

    @Override
    public void run() {

      System.out.println("Sales Assistant is ready to see the next customer.");
      System.out.println("There are no customeers to see.");
      System.out.println("Customer with Ticket " + "will be seen.");
      System.out.println("There are customers with the following tickets are in the queue: ");

      /*the rest of code to display the next customer in line, what number
            ticket is next in line and list all customers in a queue */
    }
  }

  private class CustomerTask extends TimerTask {

    @Override
    public void run() {

      customerQueue.add(customer);
      customer++;

      //System.out.println("Customer with ticket " + " is added to the queue"); 
      /*the rest of code to display the next customer in line, what number
            ticket is next in line and list all customers in a queue */
    }

  }

}
