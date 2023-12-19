public class Enums {

    // An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).
    enum Level{
        LOW,
        MEDIUM,
        HIGH,
    }
    
    
    public static void main(String[] args){
    Level myvar = Level.MEDIUM;
    System.out.println(myvar);
    }
}

