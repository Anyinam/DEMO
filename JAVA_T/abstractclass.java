//it is impossible to create an object of an abract class
abstract class abstractclass {
    //abstract method. It does not have a body. the body is provided by the subclass
    public abstract void animalsound();  

    // regular method
    public void sleep(){
        System.out.println("Zzz");
    }
    
}

class Pig extends abstractclass{
    public void animalsound(){
        // the body of the animalsound is provided here.
        System.out.println("The pig says: wee wee");
    }
}

class MainDemo{
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalsound();
        myPig.sleep();
    }
}
