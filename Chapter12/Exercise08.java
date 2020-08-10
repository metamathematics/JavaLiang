import java.util.Scanner;
import java.util.regex.Pattern;

/** Converts a hexadecimal to a decimal. */
public class Exercise08 {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter a string
    System.out.print("Enter a hex number: ");
    String hex = input.nextLine();
    
    // Display result
    System.out.println("The decimal value for hex number "
         + hex + " is " + hexToDecimal(hex.toUpperCase()));
  }
  

  /** Converts hexadecimal to decimal.
      @param hex The hexadecimal
      @return The decimal value of hex
      @throws HexFormatException if hex is not a hexadecimal
    */
  public static int hexToDecimal(String hex) throws HexFormatException {
    // Check if hex is a hexadecimal. Throw Exception if not.
    boolean patternMatch = Pattern.matches("[0-9A-F]+", hex);
    if (!patternMatch) 
      throw new HexFormatException();

    // Convert hex to a decimal
    int decimalValue = 0;
    for (int i = 0; i < hex.length(); i++) {
      char hexChar = hex.charAt(i);
      decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
    }
    // Return the decimal
    return decimalValue;
  }
  
  
  /** Converts a hexadecimal Char to a decimal.
      @param ch The hexadecimal Char
      @return The decimal value of ch
    */
  public static int hexCharToDecimal(char ch) {
    if (ch >= 'A' && ch <= 'F')
      return 10 + ch - 'A';
    else // ch is '0', '1', ..., or '9'
      return ch - '0';
  }
}
