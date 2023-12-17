//One advantage of inner classes, is that they can access attributes and methods of the outer class:
public class AccessOuterclassfroinnerclass {
    int h = 66;

    class innerclass{
        int y = 50;
        public int mymethod(){

            return h*y;
        }
    }

    
}

class Demo2{
    public static void main(String[] args){
        AccessOuterclassfroinnerclass myouter = new AccessOuterclassfroinnerclass();
        AccessOuterclassfroinnerclass.innerclass myinner = myouter.new innerclass();

        System.out.println(myinner.mymethod());

    }
}
