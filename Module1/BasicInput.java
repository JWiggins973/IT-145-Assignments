import java.util.Scanner;

public class BasicInput {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userInt = 0;
      double userDouble = 0.0;
      // FIXME Define char and string variables similarly
      char userChar = ' ';
      String userStr = " ";
      
      System.out.println("Enter integer: ");
      userInt = scnr.nextInt();
      
      System.out.println("Enter double: ");
      userDouble = scnr.nextDouble();

      System.out.println("Enter character: ");
      userChar = scnr.next().charAt(0);

      System.out.println("Enter string: ");
      userStr = scnr.next();

      System.out.println(userInt + " " + userDouble + " " + userChar + " " + userStr);
      System.out.println(userStr + " " + userChar + " " + userDouble + " " + userInt);

      int newInt = (int)userDouble;
      System.out.println(userDouble + " cast to an integer is " + newInt);

      
      return;
   }
}
