import java.util.ArrayList;
import java.util.Arrays;

public class LoopExamples {

    public static void main(String[] args) {

/*
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }

        int i = 0;
        while (i <= 10) {
            System.out.println("i = " + i);
            i++;
        }

        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int j : ints) {
            System.out.println("j = " + i);
        }
*/
        int[][] matrix = {{1, 2, 3, 5}, {6, 7, 8, 9, 10}, {1, 2, 3, 4, 5}};

        // for (int[] value : matrix) {
        //   for (int k : value) {
        //     System.out.print(k + " ");
        //  }
        //   System.out.println();
        // }
        if ((matrix[0].length < matrix[1].length)) {
            stampaMatrice(matrix[0], matrix);
        } else {
            stampaMatrice(matrix[1], matrix);
        }

        int maxInt = Arrays.stream(matrix)
                .map(array -> array.length)
                .max(Integer::compareTo)
                .orElse(0);

    }

    public static void stampaMatrice(int[] array, int[][] matrix) {
        for (int i = 0; i < array.length; i++) {
            for (int[] ints : matrix) {
                System.out.print(ints[i] + " ");
            }
            System.out.println();
        }
    }


}
