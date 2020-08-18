import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/** Makes a dataset of 1,000 faculty members. */
public class Exercise24 {
  private static Random r = new Random();

  /** The main method. */
  public static void main(String[] args) throws IOException {

    PrintWriter output = new PrintWriter("Salary.txt");
    for (int i = 1; i <= 1000; i++) {
      int randomNumber = r.nextInt(3);
      output.printf("FirstName%d LastName%d %9s %9.2f\n", i, i, rank(randomNumber), salary(randomNumber));
    }
    output.println();
    output.close();
  }
  

  /** Returns a professor rank title, given input 0, 1 or 2.
      @param randomNumber An int 0, 1, or 2
      @return Professor rank title assistant, associate, or full
    */
  private static String rank(int randomNumber) {
    String title = "";
    switch (randomNumber) {
      case 0: title = "assistant";
              break;
      case 1: title = "associate";
              break;
      case 2: title = "full";
              break;
      default: 
    }
    return title;
  }

  
  /** Returns a salary, given input 0, 1, or 2.
      @param randomNumber An int 0, 1, or 2
      @return A salary of range 50k-80k, 60k-110k, or 75k-130k
    */
  private static double salary(int randomNumber) {
    int salary = 0;
    switch (randomNumber) {
      case 0: salary = (r.nextInt(3000000) + 5000000);
              break;
      case 1: salary = (r.nextInt(5000000) + 6000000);
              break;
      case 2: salary = (r.nextInt(5500000) + 7500000);
              break;
      default:
    }
    return salary / 100.0;
  }
}
