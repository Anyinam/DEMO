enum Level{
    LOW,
    MEDIUM,
    HIGH
}

public class Enumsinswitchstatement{
    public static void main(String[] args){
        Level myvar = Level.MEDIUM;

        switch(myvar) {
            case LOW:
            System.out.println("Low level");
            break;

            case MEDIUM:
            System.out.println("Medium level");
            break;

            case HIGH:
            System.out.println("High level");
            break;
        }

        // loop through enum
        for (Level myVar : Level.values()){
            System.out.println(myVar);
        }
    }
}
