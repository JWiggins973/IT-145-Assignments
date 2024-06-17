import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    // Instance variables (if needed)

    public static void main(String[] args) {

        initializeDogList();
        initializeMonkeyList();

        Scanner scnr = new Scanner(System.in);
        char userInput;
        char validate;

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods
        // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
        // method.

        // Print menu loop with user validation and case sensitivity
        do {
            displayMenu();
            userInput = scnr.next().charAt(0);

            System.out.println("You enetred " + userInput);
            System.out.println("Is that correct? enter (y/n)");
            validate = scnr.next().charAt(0);
            scnr.nextLine(); // Consumes line after reading char
            System.out.println();
            System.out.println();

            if (validate == 'y' || validate == 'Y') {
                switch (userInput) {
                    case '1':
                        intakeNewDog(scnr); // Calls intake new dog method
                        break;

                    case '2':
                        intakeNewMonkey(scnr); // Call intake new monkey method
                        break;

                    case '3':
                        reserveAnimal(scnr); // Calls reverse animal method
                        break;

                    case '4':
                    case '5':
                    case '6':
                        printAnimals(userInput); // Prints animal based on input
                        break;

                    case 'q':
                    case 'Q':
                        System.out.println("You are exiting the program."); // Exits program
                        break;

                    // Print invalid reprompts user
                    default:
                        System.out.println("Invalid input");
                }

            }

            // If user input wrong input get correct input
            else {
                System.out.println("Please enter your desired input");
            }
        } while (userInput != 'q' && userInput != 'Q');

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake",
                false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false,
                "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true,
                "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    // Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey("George", "Capuchin", "Male", "5", "31", "11", "6", "9", "02-01-2019",
                "United States", "Phase I", false, "United States");

        monkeyList.add(monkey1);
    }

    // IntakeNewDog method
    public static void intakeNewDog(Scanner scnr) {

    // The input validation to check that the dog is not already in the list
        System.out.println("What is the dog's name?");
        String name = scnr.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // returns to menu
            }
        }


        // Instantiate a new dog and add it to the appropriate list
        try {

            System.out.println("What is the dog's breed?");
            String dogbreed = scnr.nextLine();

            System.out.println("What is the gender? (male/female)");
            String gender = scnr.nextLine();

            System.out.println("What is the age?");
            String age = scnr.nextLine();

            System.out.println("What is the weight?");
            String weight = scnr.nextLine();

            System.out.println("What is the acquisition Date? (month-day-year)");
            String acquisitionDate = scnr.nextLine();

            System.out.println("What is the acquisition country?");
            String acquisitionCountry = scnr.nextLine();

            System.out.println("What is the training status?");
            String trainingStatus = scnr.nextLine();

            System.out.println("Is the animal reserved? (User Enter true or false)");
            boolean reserved = scnr.nextBoolean();
            scnr.nextLine(); // Consumes empty line left after boolean

            System.out.println("What is the service country?");
            String serviceCountry = scnr.nextLine();

            // Create new dog object
            Dog newDog = new Dog(name, dogbreed, gender, age, weight, acquisitionDate,
                    acquisitionCountry, trainingStatus, reserved, serviceCountry);

            // Add new dog to list
            dogList.add(newDog);
        } 
        
        catch (InputMismatchException e) {
            System.out.println("Error: Input mismatch enter boolean (true/false)"); // Prints error message for mismatch input
            scnr.nextLine(); // Consume invild input line
            return; // Return to main menu
        }

    }

    // IntakeNewMonkey
    public static void intakeNewMonkey(Scanner scnr) {
        // Validate the input to make sure the monkey doesn't already exist
        System.out.println("What is the Monkeys's name?");
        String name = scnr.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; // returns to menu
            }
        }

        // Validate the species type is allowed
        System.out.println("What is the monkeys's species?");
        String species = scnr.nextLine().toLowerCase();
        while (!Monkey.VALID_SPECIES.contains(species)) {
            System.out.println("Enter a valid species type: " + String.join(", ", Monkey.VALID_SPECIES));
            species = scnr.nextLine().toLowerCase();
        }

        // Instantiate and add the new monkey to the appropriate list
        try {

            System.out.println("What is the gender? (male/female)");
            String gender = scnr.nextLine();

            System.out.println("What is the age?");
            String age = scnr.nextLine();

            System.out.println("What is the weight?");
            String weight = scnr.nextLine();

            System.out.println("What is the tail length?");
            String tailLength = scnr.nextLine();

            System.out.println("What is the height?");
            String height = scnr.nextLine();

            System.out.println("What is the body length?");
            String bodyLength = scnr.nextLine();

            System.out.println("What is the acquisition date? (month-day-year)");
            String acquisitionDate = scnr.nextLine();

            System.out.println("What is the acquisition country?");
            String acquisitionCountry = scnr.nextLine();

            System.out.println("What is the training status?");
            String trainingStatus = scnr.nextLine();

            System.out.println("Is the animal reserved? (User Enter true or false)");
            boolean reserved = scnr.nextBoolean();
            scnr.nextLine(); // Consumes empty line left after boolean

            System.out.println("What is the service country?");
            String serviceCountry = scnr.nextLine();

            // Create new Monkey object
            Monkey newMonkey = new Monkey(name, species, gender, age, weight, tailLength, height, bodyLength,
                    acquisitionDate, acquisitionCountry, trainingStatus, reserved, serviceCountry);

            // Add new Monkey to list
            monkeyList.add(newMonkey);

        } 
        
        catch (InputMismatchException e) {
            System.out.println("Error: Input mismatch enter boolean (true/false)"); // Error message for mismatch input 
            scnr.nextLine(); // Consume invild input line
            return; // Return to main menu
        }
    }

    // ReserveAnimal
    public static void reserveAnimal(Scanner scnr) {

        // Initialize variable
        String animal;
        String country;
        boolean reservation;
        String reservedAnimalName = " ";

        // Validate input is monkey or dog
        do {
            System.out.println("What type of animal would you like to reserve today?");
            animal = scnr.nextLine();
        } while (!animal.equalsIgnoreCase("monkey") && !animal.equalsIgnoreCase("dog"));

        // Ask user what country for reservatiom
        System.out.println("In what country would you like to make the reservation?");
        country = scnr.nextLine();

        // Set reservation to false for print statement
        reservation = false;

        // Loop through list to find user desired animal if available
        if (animal.equalsIgnoreCase("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (monkey.getInServiceLocation().equalsIgnoreCase(country) && !monkey.getReserved()
                        && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
                    monkey.setReserved(true);
                    reservation = true;
                    reservedAnimalName = monkey.getName();
                    break; // Stop looking for monkey once one found with requirements
                }

            }
        } else if (animal.equalsIgnoreCase("dog")) {
            for (Dog dog : dogList) {
                if (dog.getInServiceLocation().equalsIgnoreCase(country) && !dog.getReserved()
                        && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                    dog.setReserved(true);
                    reservation = true;
                    reservedAnimalName = dog.getName();
                    break; // Stop looking for dog once one found with requirements
                }
            }
        }
        if (reservation) {
            // Prints when animal found for reservation
            System.out.println("You reserved " + animal + " named " + reservedAnimalName);
        } else {
            // Prints when no animal found for reservation
            System.out.println("No available " + animal + "s at this time.");
        }

    }

    // PrintAnimals
    // Include the animal name, status, acquisition country and if the animal is
    // reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved
    // Remember that you only have to fully implement ONE of these lists.
    // The other lists can have a print statement saying "This option needs to be
    // implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals(char userInput) {
        if (userInput == '4') {
            System.out.println("List of all Dogs");
            for (Dog dog : dogList) {
                System.out.println("Name: " + dog.getName() + "  Status: " + dog.getTrainingStatus()
                        + "  Aquisition country: " + dog.getAcquisitionLocation() + "  Training status: "
                        + dog.getTrainingStatus());
            }
        } else if (userInput == '5') {
            System.out.println("List of all Monkeys");
            for (Monkey monkey : monkeyList) {
                System.out.println("Name: " + monkey.getName() + "  Status: " + monkey.getTrainingStatus()
                        + "  Aquisition country: " + monkey.getAcquisitionLocation() + "  Training status: "
                        + monkey.getTrainingStatus());
            }
        } else if (userInput == '6') {
            System.out.println("List of unreserved Dogs");
            for (Dog dog : dogList) {
                if (!dog.getReserved() && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                    System.out.println("Name: " + dog.getName() + "  Status: " + dog.getTrainingStatus()
                            + "  Aquisition country: " + dog.getAcquisitionLocation() + "  Training status: "
                            + dog.getTrainingStatus());
                }
            }
            System.out.println();
            System.out.println("List of unreserved Monkeys");
            for (Monkey monkey : monkeyList) {
                if (!monkey.getReserved() && monkey.getTrainingStatus().equalsIgnoreCase("in service")) {
                    System.out.println("Name: " + monkey.getName() + "  Status: " + monkey.getTrainingStatus()
                            + "  Aquisition Country: " + monkey.getAcquisitionLocation() + "  Training Status: "
                            + monkey.getTrainingStatus());
                }
            }
        }

    }
}
