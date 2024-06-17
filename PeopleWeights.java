import java.util.Scanner;

public class PeopleWeights {
   public static void main(String[] args) {
      // varaibles
      Scanner scnr = new Scanner(System.in);
      double[] userWeight = new double[5];
      int i;
      double totalWeight = 0.0;
      double maxWeight = 0;
      double averageWeight = 0.0;
      
      
      // loop to fill array
      for (i = 0; i < userWeight.length; i++) {
         System.out.println("Enter weight " + (i + 1) + ": ");
         userWeight[i] = scnr.nextDouble();  
      }
      System.out.println();
      
      // loop to print array
      System.out.print("You entered: ");
      for (i = 0; i < userWeight.length; i++) {
           System.out.print(userWeight[i] + " ");
      }
      
      // loop for total weight print total and average wieght
      for (i = 0; i < userWeight.length; i++) {
         totalWeight += userWeight[i];
      }
      averageWeight = totalWeight / userWeight.length;
      System.out.println();
      System.out.println("Total weight: " + totalWeight);
      System.out.println("Average weight: " + averageWeight);
      
      // loop for maxWeight
      maxWeight = userWeight[0];
      for (i = 0; i < userWeight.length; i++) {
         if (maxWeight < userWeight[i]) {
            maxWeight = userWeight[i];
         } 
      }
      System.out.println("Max weight: " + maxWeight);
      
      
      return;
   }
}