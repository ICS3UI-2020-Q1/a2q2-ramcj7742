import java.util.Scanner;

/**
 * Selects the biggest number
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets first number from user
    System.out.println("Please enter an integer:");
    int a = input.nextInt();

    // gets second number from user
    System.out.println("Please enter another integer:");
    int b = input.nextInt();

    // Selects largest number
    if (a > b) {
      System.out.println("The biggest number is " + a);
    } else if (a < b) {
      System.out.println("The biggest number is " + b);
    } else if (a == b) {
      System.out.println("There is no biggest number.");
    }
    
  }
}
