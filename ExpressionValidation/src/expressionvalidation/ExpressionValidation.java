/**
 * Task 2 Analysis
 * 
 * Stack is a good choice of data structure, even though the functionality could
 * be somewhat replicated by a List, because it eliminates any need
 * for a counter. I could see using 2 lists, one for opening chars and another
 * for closing chars, and comparing list lengths as an easy solve for this.
 */

package expressionvalidation;

import java.util.Scanner;
import java.util.Stack;

/**
 * ExpressionValidation, accepts and evaluates user input and displays result.
 * @author Rob Tutauha
 */
public class ExpressionValidation {
  
  
  /**
  * main() accepts input, evaluates and displays result.
  * @param args
  */
  public static void main(String[] args) {

    // User inputs
    Stack<Character> expressionStack = new Stack<>();
    System.out.println("Enter expression: ");
    Scanner expressionScan = new Scanner(System.in);
    String expression = expressionScan.nextLine();

    System.out.println("Enter opening character to validate: ");
    Scanner openCharScan = new Scanner(System.in);
    char openCharacter = openCharScan.next().charAt(0);

    System.out.println("Enter closing character to validate: ");
    Scanner closeCharScan = new Scanner(System.in);
    char closeCharacter = closeCharScan.next().charAt(0);

    // Expression conversion to individual characters and added to array
    char[] expressionList = expression.toCharArray();

    // Expression validity flags
    Boolean valid = true;
    Boolean doubleCheck = false;

    // Expression evaluation
    for (char c : expressionList) {
      if (c == openCharacter) {
        expressionStack.push(c);
        valid = false;
      } else if (c == closeCharacter && expressionStack.isEmpty()) {
        valid = false;
        break;
      } else if (c == closeCharacter) {
        expressionStack.pop();
        valid = true;
      } else {
        System.out.println("Ruh-Oh Raggy.");
      }
    }
    
    if (!expressionStack.isEmpty()) {
      valid = false;
    }

    // Result display
    if (valid == false) {
      System.out.println("yeahnah, invalid expression");
    } else {
      System.out.println("congrats, valid expression");
    }
  }
}
