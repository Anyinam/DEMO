//abstract class
abstract class Abstractmodifier {
    public String fname = "Danny";
    public int age = 24;
    public abstract void study();  //abstract method
}

    // Subclass (inherit from Abstractmodifier)
class Student extends Abstractmodifier {
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
    }
}
   

   

