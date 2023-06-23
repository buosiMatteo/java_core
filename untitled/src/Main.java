public class Main {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
       if (x % 2 == 0) {
            System.out.println("EVEN");
        } else {
           System.out.println("ODD");
       }
        //System.out.println("Hello World! This is " + args[0]);
    }
}