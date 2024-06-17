import java.util.Scanner;

public class LabCount {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userText;
      int countChar = 0; // Counts all the valid characters 
      
   
      userText = scnr.nextLine();  // Gets entire line, including spaces. 

      // Loop through userText 
      for (int i = 0; i < userText.length(); i ++) {
        // check each index and keeps track of valid chars
        if (Character.isLetter(userText.charAt(i))){
            countChar += 1;
        }
        else if (Character.isDigit(userText.charAt(i))) {
            countChar += 1;
        }
        else if (userText.charAt(i) == '?'){
            countChar += 1;
        }
        else {
            countChar += 0;
        }

      }
      
      System.out.println(countChar);
   }
}
