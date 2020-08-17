import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/** Writes random ints to a file, then reads, sorts and displays them. */
public class Exercise15 {
  /** The main method. */
  public static void main(String[] args) throws IOException {
    // Create the file
    File sourceFile = new File("Exercise12_15.txt");
    if (sourceFile.exists()) {
      System.out.printf("File %s already exists.\n", sourceFile.getName());
      System.exit(1);
    }
    
    // Write 100 random ints to the file
    PrintWriter output = new PrintWriter(sourceFile);
    Random r = new Random();
    for (int i = 1; i <= 100; i++) {
      output.printf("%3d ", r.nextInt(100) + 1);
      if ((i % 10) == 0)
        output.println();
    }
    output.close();

    // Read the int from the file and store in an array
    Scanner input = new Scanner(sourceFile);
    int[] nums = new int[100];
    for (int i = 0; i < 100; i++) {
      nums[i] = input.nextInt();
    }
    input.close();

    // Sort the array in increasing order
    Arrays.sort(nums);

    // Display the contents of the array
    System.out.println();
    for (int i = 1; i <= 100; i++) {
      System.out.printf("%3d ", nums[i - 1]);
      if ((i % 10) == 0) {
        System.out.println();
      }
    }
    System.out.println();
  }
}
