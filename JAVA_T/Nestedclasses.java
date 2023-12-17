import Nestedclasses.Innerclass;

public class Nestedclasses{
    int X = 5;

    class Innerclass{
        int y= 6;
    }
    
}

class NestedclassDemo{
    public static void main(String[] args) {
       Nestedclasses myx = new Nestedclasses();

       Nestedclasses.Innerclass myy = myx.new Innerclass();

       System.out.println( myx.X + myy.y);


    }

}

