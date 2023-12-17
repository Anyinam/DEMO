public class PolymorphismAnimalMain {
    public static void main(String[] args) {
        PolymorphismAnimal myAnimal = new PolymorphismAnimal();  // Create a Animal object
        PolymorphismAnimal myPig = new Pig();  // Create a Pig object
        PolymorphismAnimal myDog = new Dog();  // Create a Dog object
        myAnimal.animalsound();
        myPig.animalsound();
        myDog.animalsound();
      }
    
}
