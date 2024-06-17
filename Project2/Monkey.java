import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Monkey extends RescueAnimal {

    // Instance Variables
    private String tailLength;
    private String height;
    private String bodyLength;
    private String species;

    // Array list for Valid species type
    public static final ArrayList<String> VALID_SPECIES = new ArrayList<>(Arrays.asList(
            "capuchin",
            "guenon",
            "macaque",
            "squirrel monkey",
            "tamarin"));

    // Detailed constructor
    public Monkey(String name, String species, String gender, String age,
            String weight, String tailLength, String height, String bodyLength,
            String acquisitionDate, String acquisitionCountry, String trainingStatus,
            boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
    }

    // Simple constructor for Animal specific attributes
    public Monkey(String species, String tailLength, String height, String bodyLength) {
        this.species = species;
        this.tailLength = tailLength;
        this.height = height;
        this.bodyLength = bodyLength;
    }

    // Accessor Methods
    public String getTailLength() {
        return tailLength; // Gets tailLength
    }

    public String getHeight() {
        return height; // Gets tailLength
    }

    public String getBodyLength() {
        return bodyLength; // Gets bodyLength
    }

    public String getSpecies() {
        return species; // Gets Species
    }

    // Mutator Methods
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength; // Sets tailLength
    }

    public void setHeight(String height) {
        this.height = height; // Sets height
    }

    public void setBodyLength(String bodyLength) {
        this.bodyLength = bodyLength; // Sets bodyLength
    }

    public void setSpecies(String species) {
        this.species = species; // Sets species
    }

}
