public class LoopExamples {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        // for (int[] value : matrix) {
        //   for (int k : value) {
        //     System.out.print(k + " ");
        //  }
        //   System.out.println();
        // }
        if (matrix[0].length<matrix[1].length) {
            for (int i = 0; i < matrix[0].length; i++) {
                for (int[] ints : matrix) {
                    System.out.print(ints[i] + " ");
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < matrix[1].length; i++) {
                for (int[] ints : matrix) {
                    System.out.print(ints[i] + " ");
                }
                System.out.println();
            }
        }
    }

}
