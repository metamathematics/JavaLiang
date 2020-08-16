import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Exercise13 {
  /** The main method. */
  public static void main(String[] args) throws IOException {
    // Check that command is entered correctly
    if (args.length != 1) {
      System.out.println("Usage: java Exercise13 fileName");
    }

    // Check that source file exists
    File file = new File(args[0]);
    if (!file.exists()) {
      System.out.printf("File %s does not exist\n", file);
    }

    // Create Scanner object
    Scanner input = new Scanner(file);

    int characters = 0;
    int words = 0;
    int lines = 0;
    while (input.hasNext()) {
      // Count each line
      String line = input.nextLine();
      lines++;

      // The number of characters is the length of the line plus the newline character
      characters += line.length() + 1;

      Scanner string = new Scanner(line);
      while (string.hasNext()) {
        // Count each word
        string.next();
        words++;
      }
      string.close();
    }
    input.close();

    // Print results
    System.out.printf("File %s has\n", args[0]);
    System.out.printf("%d characters\n", characters);
    System.out.printf("%d words\n", words);
    System.out.printf("%d lines\n", lines);
  }
}
