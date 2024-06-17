public class Cat {
    
    // Instance Field
    private int catSpaceNumber;

    // Contructor no arg and arg for immediate initailization
    public Cat() {
        catSpaceNumber = 0;
    }

    public Cat(int catSpaceNumber) {
        this.catSpaceNumber = catSpaceNumber;
    }

    // Mutator set cat space num
    public void setCatSpaceNumber(int catSpaceNumber){
        this.catSpaceNumber = catSpaceNumber;
    }

     // Accessor get cat space num
    public int getCatSpaceNumber() {
        return catSpaceNumber; 
    }

}
