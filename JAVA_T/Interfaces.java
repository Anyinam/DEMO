// An interface is declared using the 'interface' keyword
interface Interfaces {
    // Interface methods do not have a body
    public void animalsound();
    public void sleep();
}

// Pig class implements the Interfaces interface
class Pig implements Interfaces {
    // Implementing the animalsound method
    public void animalsound() {
        System.out.println("The pig says: wee wee");
    }

    // Implementing the sleep method
    public void sleep() {
        System.out.println("Zzzz");
    }
}

// MainInterface class contains the main method to run the program
class MainInterface {
    public static void main(String[] args) {
        // Creating an instance of the Pig class
        Pig myPig = new Pig();

        // Calling methods on the Pig instance
        myPig.animalsound();
        myPig.sleep();
    }
}
