public class giveafineofcarspeed {
    public void Speedfine(int KM, int speedlimit){
        if (KM > speedlimit){
            System.err.println("Give a fine");
        } else {
            System.out.println("Ignore");
        }

    }
    
    public static void main(String[] args){
        giveafineofcarspeed Policecheck = new giveafineofcarspeed();
        Policecheck.Speedfine(250, 260);
    }

    
}
