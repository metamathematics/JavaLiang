import java.util.Scanner;
import java.util.InputMismatchException;

/** Reads two ints and displays their sum. */
public class Exercise02 {
  /** The main method. */
  public static void main(String[] args) {
    // Creat Scanner object
    Scanner input = new Scanner(System.in);
    // Prompt user for input
    System.out.println("\nEnter two integers.");
    // Request the input until it is correct
    int number1 = 0;
    int number2 = 0;
    boolean inputIsGood = false;
    while (!inputIsGood) {
      try {
        System.out.print("\nInteger 1: ");
        number1 = input.nextInt();
        System.out.print("Integer 2: ");
        number2 = input.nextInt();
        inputIsGood = true;
      } catch (InputMismatchException ex) {
        System.out.println("\nIntegers are the only acceptable input.");
        System.out.println("Enter two integers.");
        input.nextLine();
      }
    }
    // Find sum and print result
    int sum = number1 + number2;
    System.out.printf("\n  %d + %d = %d\n\n", number1, number2, sum);
  }
}
