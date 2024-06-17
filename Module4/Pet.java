public class Pet {

// Instance Fields
private String petType;
private String petName;
private int petAge;
private int dogSpaces;
private int catSpaces;
private int daysStay;
private float amountDue;

// Constructor one that takes no args one that takes args
public Pet(){
    petType = "null";
    petName = "null";
    petAge = 0;
    daysStay = 0;
}

public Pet( String petType, String petName, int petAge, int daysStay ){
    this.petType = petType;
    this.petName = petName;
    this.petAge = petAge;
    this.daysStay = daysStay;
}


// Mutators setter 
public void setPetType(String petType) {
    this.petType = petType; // Set pet type
}

public void setPetName(String petName) {
    this.petName = petName; // Set pet name 
}

public void setPetAge(int petAge) {
    this.petAge = petAge; // Set pet age
}

public void setDogSpaces(int dogSpaces) {
    this.dogSpaces = dogSpaces; // set dogspaces
}

public void setCatSpaces(int catSpaces) {
    this.catSpaces = catSpaces; // Set cat spaces 
}

public void setDaysStay(int daysStay) {
    this.daysStay = daysStay; // Set days stay
}

public void setAmountDue(float amountDue) {
    this.amountDue = amountDue; // Set amount due
}

// Accesors getters
public String getPetType() {
    return petType; // Return pet type
}

public String getPetName() {
   return petName; // Return pet name 
}

public int getPetAge() {
    return petAge; // Return pet age
}

public int getDogSpaces() {
    return dogSpaces; // Return dog spaces
}

public int getCatSpaces() {
    return catSpaces; // Return cat spaces
}

public int getDaysStay() {
    return daysStay; // Return days stay
}

public float getAmountDue() {
    return amountDue; // Return amount due
}
    
}
