//import java.util.Scanner;

public class HelloWorld {

  public static void main(String[] args) {
    //Scanner tastiera = new Scanner(System.in);
    //System.out.println("Inserisci un numero: ");
    //String x = tastiera.nextLine();
    int y = Integer.parseInt(args[0]);
    if(y % 2 == 0){
      System.out.println("The number is even");
    }  else {
      System.out.println("The number is odd");
    }
    int x = Integer.parseInt(args[1]);
    if(x % 2 == 0){
      System.out.println("The number is even");
    }  else {
      System.out.println("The number is odd");
    }
    //tastiera.close();
    //System.out.println("");

  }

}
