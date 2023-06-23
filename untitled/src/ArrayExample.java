public class ArrayExample {
    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5};
        int i = 0;
        while (i < ints.length) {
            System.out.println(ints[i]);
            i++;
        }
        for (int b : ints) {
            System.out.println(b);
        }

    }
}
