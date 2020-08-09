import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/** Converts a binary to a decimal. */
public class Exercise07 {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt user to enter a string
    System.out.print("Enter a binary number: ");
    String binary = input.nextLine();
    
    // Display result
    System.out.println("The decimal value for binary number "
      + binary + " is " + binaryToDecimal(binary));
  }
  

  /** Converts binary to decimal.
      @param binary The binary number
      @return The deciaml value of binary
      @throws NumberFormatException if binary is not a binary number
    */
  public static int binaryToDecimal(String binary) throws NumberFormatException {
    // Check if binary is a binary number. Throw Exception if not.
    boolean patternMatch = Pattern.matches("[01]+", binary);
    if (!patternMatch) 
      throw new NumberFormatException();

    // Convert binary to a decimal
    int decimalValue = 0;
    for (int i = 0; i < binary.length(); i++) {
      char bit = binary.charAt(i);
      decimalValue += bitToDecimal(bit, binary.length(), i);
    }
    // Return the decimal
    return decimalValue;
  }
  
  
  /** Converts a hexadecimal Char to a deciaml.
      @param ch The hexadecimal Char
      @return The decimal value of ch
    */
  public static double bitToDecimal(char bit, int binaryLength, int position) {
    int n = (binaryLength - 1) - position;
    return Math.pow((2 * Character.getNumericValue(bit)), n);
  }
}
