/** A simple calculator that does arithmetic on just 2 integers. */
public class Exercise01 {
  /** The main method. */
  public static void main(String[] args) {
    // Check number of strings passed
    if (args.length != 3) {
      System.out.println("Usage: java Exercise01 operand1 operator operand2");
      System.exit(0);
    }

   int operand1 = 1;
   int operand2 = 1;
   // Attempt to convert operand1 to an int
   try {
      operand1 = Integer.parseInt(args[0]);
    } catch (NumberFormatException ex) {
      System.out.printf("Wrong Input: %s\n", args[0]);
      System.exit(0);
    }
    // Attempt to convert operand2 to an int
    try {
      operand2 = Integer.parseInt(args[2]);
    } catch (NumberFormatException ex) {
      System.out.printf("Wrong Input: %s\n", args[2]);
      System.exit(0);
    }

    // Compute problem
    int result = 0;
    switch (args[1].charAt(0)) {
      case '+': result = operand1 + operand2;
                break;
      case '-': result = operand1 - operand2;
                break;
      case '.': result = operand1 * operand2;
                break;
      case '/': if (operand2 == 0) {
                  System.out.println("Cannot divide by 0.");
                  System.exit(0);
                }
                result = operand1 / operand2;
    }

    // Print results
    System.out.printf("%d %s %d = %d\n", operand1, args[1], operand2, result);
  }
}
