public class Try2 {
    static int myMethod(int x, int y) {
        return y + x * y;
      }
    
      public static void main(String[] args) {
        int z = myMethod(0, 0);
        System.out.println(myMethod(3, 5));
      }
}
