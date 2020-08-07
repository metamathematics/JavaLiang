import java.util.Random;
import java.util.Scanner;

/** Makes an array of random ints; 
    The user types an index, and the program display the contents of array[index] 
  */
public class Exercise03 {
  /** The main method. */
  public static void main(String[] args) {

    // Create an array of 100 random ints
    Random r = new Random();
    int[] numbers = new int[100];
    for (int index = 0; index < numbers.length; index++)
      numbers[index] = r.nextInt();

    // Prompt user to pick an index
    Scanner input = new Scanner(System.in);
    System.out.print("\nEnter an index: ");
    int index = input.nextInt();

    // Display the array contents at index if the index is not out of bounds
    try {
      System.out.printf("The integer at index %d is %d\n\n", index, numbers[index]);
    } catch (ArrayIndexOutOfBoundsException ex) {
      System.out.println("Out of Bounds\n\n");
    }
  }
}
