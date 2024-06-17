import java.util.Scanner; 

public class OutputWithVars {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum = 0;
      int userNum2 = 0;
      int sum = 0;

      System.out.println("Enter integer: ");
      userNum = scnr.nextInt();
      System.out.println("You entered: " + userNum);
      System.out.println(userNum + " squared is " + userNum * userNum);
      System.out.println(userNum + " cubed is " + userNum * userNum * userNum);

      //Handle 2nd input
      System.out.print("Enter another integer: ");
      userNum2 = scnr.nextInt();
      sum = userNum + userNum2;
      System.out.println(userNum + " + " + userNum2 + " is " + sum);
      System.out.println(userNum + " * " + userNum2 + " is " + userNum * userNum2);
      
      return;
   }
}