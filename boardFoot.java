import java.util.Scanner;
 
class boardFoot {
  
  // calculates the length and returns it to the main method  
  public static double calculate(double userHeightDou1, double userWidthDou1) {
    double area = userHeightDou1 * userWidthDou1;
    double length1 = 144 / area;
    return length1;
  }
    
  public static void main(String[] args) {
    // creates scanner object
    Scanner myObj = new Scanner(System.in);

    // declares variables
    double userHeightDou = 0;
    double userWidthDou = 0;
    double length = 0;

    // while loop to get user input
    while (true) {
      System.out.println("Enter the wood's height in inches:");
      String userHeightStr = myObj.nextLine();

      System.out.println("Enter the wood's width in inches:");
      String userWidthStr = myObj.nextLine();

      // checks if the user's input is a number
      try {
        userHeightDou = Double.parseDouble(userHeightStr);
        userWidthDou = Double.parseDouble(userWidthStr);
    
      } catch (NumberFormatException e) {
        userHeightDou = -1;
        userWidthDou = -1;
      }
      
      if (userHeightDou == -1 || userWidthDou == -1) {
        System.out.println("invalid input");
      } else {
        length = calculate(userHeightDou, userWidthDou);
        System.out.println(length);
        break;
      }
      
    }

        
  }

}