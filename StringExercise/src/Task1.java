import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        String s = "Java Exercise";
        Scanner tastiera = new Scanner(System.in);
        int index;
        do {
            System.out.print("selezionare l'indice da cui ricavare il carattere compreso tra 1 e " + s.length() + ": ");
            index = tastiera.nextInt();
        } while (index > s.length());
        char c = s.charAt(index);
        System.out.format("Il carattere in poszione %d è '%c'",index,c);
    }

}
