public class Dog {

    // Instance Field
    private int dogSpaceNumber;
    private int dogWeight;
    private boolean grooming;


    // Constructor no args and args for immediate initialization
    public Dog() {
        dogWeight = 0;
        dogSpaceNumber = 0;
        grooming = false;
    }

    public Dog(int dogWeight, int dogSpaceNumber, boolean grooming) {
        this.dogWeight = dogWeight;
        this.dogSpaceNumber = dogSpaceNumber;
        this.grooming = grooming;
    }

    // Mutators set grooming, weight, and space number
    public void setGrooming(boolean grooming) {
        this.grooming = grooming;
    }

    public void setDogWeight(int dogWeight) {
        this.dogWeight = dogWeight;
    }
    public void setDogSpaceNumber(int dogSpaceNumber) {
        this.dogSpaceNumber = dogSpaceNumber;
    }

    // Accessors returns grooming, weight,and space number
    public boolean getGrooming() {
        return grooming;
    }

    public int getDogWeight() {
        return dogWeight;
    }

    public int getdogSpaceNumber() {
        return dogSpaceNumber;
    }
}