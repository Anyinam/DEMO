public class Apartment{
    int bathroom = 0;
    int toilet = 0;

    void Apartment_bathroom(int newValue){
        bathroom = newValue;

    }

    void Apartment_toilet(int newValue){
        toilet = newValue;

    }

    void PrintStates(){
        System.out.println("Bathroom : "+ bathroom + " Toilet : " + toilet );
    }
}

class ApartmentDemo {
    public static void main(String[] args){
        Apartment Apartment1 = new Apartment();

        Apartment1.Apartment_bathroom(1);
        Apartment1.Apartment_toilet(1);


        Apartment1.PrintStates();
    }
}