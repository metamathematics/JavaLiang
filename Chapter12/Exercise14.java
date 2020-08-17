import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/** Finds the sum and average of scores in a text file. */
public class Exercise14 {
  /** The main method. */
  public static void main(String[] args) throws IOException {
    // Create scanner and prompt user to enter file name
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter the filename:");
    // Create File object and file scanner
    File file = new File(userInput.next());
    Scanner fileInput = new Scanner(file);

    ArrayList<Double> scores = new ArrayList<>();
    double sum = 0.0;
    while (fileInput.hasNext()) {
      // Find the sum
      double num = Double.parseDouble(fileInput.next());
      scores.add(num);
      sum += num;
    }
    // Find the average
    double average = sum / ((double) scores.size());

    // Print the results
    System.out.printf("sum: %.2f\n", sum);
    System.out.printf("average: %.2f\n", average);
  }
}
