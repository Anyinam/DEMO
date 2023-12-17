//An inner class can also be static, which means that you can access it without creating an object of the outer class:

public class staticinnerclass {
    int j = 49;

    static class Innerclass{
        int g = 77;

    }
    
}

class Demo{
    public static void main(String[] args){
        staticinnerclass.Innerclass myg = new staticinnerclass.Innerclass();

        System.out.println(myg.g);
    }

}