public class contr {
  int modelYear;
  String modelName;

  public contr(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    contr myCar = new contr(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
    
}
