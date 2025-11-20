public class LiskovPrinciple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Bird sparrow = new Sparrow();
        sparrow.layEggs(); // Output: "Bird is laying eggs"
        
        Bird penguin = new Penguin();
        penguin.layEggs(); // Output: "Bird is laying eggs" 

        Flyable flyingSparrow = new Sparrow();
        flyingSparrow.fly(); // Output: "Sparrow is flying"

       
    }
    
}
