import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String s = "Java Exercise";
        Scanner tastiera = new Scanner(System.in);
        int index;
        do {
            System.out.print("selezionare l'indice da cui ricavare il carattere compreso tra 0 e " + (s.length()-1) + ": ");
            index = tastiera.nextInt();
        } while (index > s.length());
        char c = s.charAt(index);
        int unicode=(int)c;
        System.out.println("Il carattere" + c + "in caratteri unicode è " + unicode);
    }


}
