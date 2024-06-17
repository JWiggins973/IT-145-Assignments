import java.util.Scanner; 

public class LabDrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight;
      int arrowBaseWidth;
      int arrowHeadWidth;
      
      System.out.println("Enter arrow base height:");
      arrowBaseHeight = scnr.nextInt();
      
      System.out.println("Enter arrow base width:");
      arrowBaseWidth = scnr.nextInt();

      System.out.println("Enter arrow head width:");
      arrowHeadWidth = scnr.nextInt();
      
      // Loop to check arrowheadWidth > arrowHeadBaseWidth
      while (arrowHeadWidth < arrowBaseWidth) {
        System.out.println("Enter arrow head width:");
        arrowHeadWidth = scnr.nextInt(); 
      }
      System.out.println("");
      
      // Draw arrow base
      for (int i = 0; i < arrowBaseHeight; i++) {
          for (int j = 0; j < arrowBaseWidth; j++){
            System.out.print("*");
          }
          System.out.println();      
      }

      // Draw arrow head 
      for (int k = 0; k <= arrowHeadWidth; k++) {
        for (int w = arrowHeadWidth; w > k; w--) {
          System.out.print("*");
        }
        if (k == arrowHeadWidth) {
          break;
        }
        else {
          System.out.println();
        }
        
      } 
   }
}