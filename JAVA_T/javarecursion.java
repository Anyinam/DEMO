public class javarecursion {
    public static int sum(int i){
        if (i >0) {
            return i + sum(i-1);
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args){
        int result = sum(10);
        System.out.println(result);

    }
}
