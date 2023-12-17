public class InheritanceVehicle {
    protected String brand = "Ford";
    public void honk(){          //vehicle method
        System.out.println("ttt,tt");
    }
    
}

class Car extends InheritanceVehicle{
    private String modelName = "Mustang";
    public static void main(String[] args){

        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}