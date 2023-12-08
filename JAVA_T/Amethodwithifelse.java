public class Amethodwithifelse {
    static void checkAge(String fname, int age){
        if (age < 18){
            System.out.println(fname + " is Immature to watch this content");
        } else {
            System.out.println(fname + " is mature to watch this content");
        }
    }
    
    public static void main(String[] args) {
        checkAge("Daniel", 19);
    }
}
