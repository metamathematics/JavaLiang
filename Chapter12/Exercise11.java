import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/** Removes all occurences of a specified String from a text file. */
public class Exercise11 {
  /** The main method. */
  public static void main(String[] args) throws IOException {
    // Check that command was entered properly
    if (args.length != 2) {
      System.out.println("Usage: java Exercise11 string sourceFile");
      System.exit(1);
    }
    
    // Check if source file exists
    File sourceFile = new File(args[1]);
    if (!sourceFile.exists()) {
      System.out.printf("Source file \'%s\' does not exist\n", args[1]);
      System.exit(2);
    }
    
    // Create temp file to write all text to
    File tempFile = new File("temp.txt");
    
    try (
      // Create input and output files
      Scanner input = new Scanner(sourceFile);
      PrintWriter output = new PrintWriter(tempFile);
    ) {
      // Copy sourceFile text to tempFile with specified string deleted
      while (input.hasNext()) {
        String s1  = input.nextLine();
        String s2 = s1.replaceAll(args[0], "\b");
        output.println(s2);
      }
    }
    // Rename tempFile to sourceFile
    tempFile.renameTo(sourceFile);
  }
}
