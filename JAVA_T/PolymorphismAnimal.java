public class PolymorphismAnimal {
    public void animalsound(){
        System.out.println("The animal makes a sound");
    }
    
}

class Pig extends PolymorphismAnimal{
    public void animalsound(){
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends PolymorphismAnimal{
    public void animalsound(){
        System.out.println("The dog says: bow wow");
    }
}