public class privateinnerclass {
    String d = "Something Outer";

    private class Innerclass{
        String p = "It's private";


    }

}

class privateinnerclassDemo{
    public static void main(String[] args){
        privateinnerclass string_d = new privateinnerclass();

       // privateinnerclass.Innerclass string_p = string_d.new privateinnerclass();

        System.out.println(string_d.d + " " );

       // System.out.println(string_d.d + " " + string_p.p);
       

    }
    
}
