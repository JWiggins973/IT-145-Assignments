import java.util.InputMismatchException;
import java.util.Scanner;

public class Paint1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double wallHeight = 0.0;
        double wallWidth = 0.0;
        double wallArea = 0.0;
        double gallonsPaintNeeded = 0.0;

        final double SQUARE_FEET_PER_GALLON = 350.0;

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's height
        do {
            try {
                System.out.println("Enter wall height (feet): ");
                wallHeight = scnr.nextDouble();
            } 

            catch (InputMismatchException e) {
                System.out.println("Error: Please enter a double");
                scnr.next();  // Clears invalid input
            }

        } while (wallHeight <= 0.0);

        // Implement a do-while loop to ensure input is valid
        // Prompt user to input wall's width
        do {
            try {
                System.out.println("Enter wall width (feet): ");
                wallWidth = scnr.nextDouble();
            }

            catch (InputMismatchException e) {
                System.out.println("Error: Please enter a double");
                scnr.next();  // Clears invalid input

            }
            
        } while (wallWidth <= 0.0);

        // Calculate and output wall area
        wallArea = wallHeight * wallWidth;
        System.out.println("Wall area: " + wallArea + " square feet");

        // Calculate and output the amount of paint (in gallons) needed to paint the wall
        gallonsPaintNeeded = wallArea / SQUARE_FEET_PER_GALLON;
        System.out.println("Paint needed: " + gallonsPaintNeeded + " gallons");

    }
}
