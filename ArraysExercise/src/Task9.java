import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
        int[] array1 = {10, 20, 25, 30, 45, 50};
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci il valore da aggiungere all'array: ");
        int value = tastiera.nextInt();
        System.out.print("Inserisci l'indice in cui inserire il valore: ");
        int index;
        do {
            index = tastiera.nextInt();
            if (index >= array1.length) {
                System.out.print("indice non valido, re-inserire indice: ");
            }
        } while (index > array1.length);

        int[] array2 = new int[array1.length+1];
        for (int i = array1.length; i > index; i--) {
           array2[i]=array1[i-1];
        }
        array2[index]=value;
        for (int i = 0; i < index; i++) {
            array2[i]=array1[i];
        }
        for (int i:array1) {
            System.out.print(i+ " ");
        }
        System.out.println();
        for (int i: array2){
            System.out.print(i + " ");
        }
    }

}
