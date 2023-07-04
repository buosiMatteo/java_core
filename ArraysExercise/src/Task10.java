public class Task10 {
    public static void main(String[] args) {
        int[] array = {10, 4, 2, 9, 5, 11};
        int max;
        int min;

        max = massimo(array);
        min = minimo(array);

        System.out.println("il valore massimo è " + max);
        System.out.println("il valore minimo è " + min);
    }

    static int minimo(int[] ints) {
        int m = ints[0];
        for (int i : ints) {
            if (i < m) {
                m = i;
            }
        }
        return m;
    }

    static int massimo(int[] ints) {
        int m = ints[0];
        for (int i : ints) {
            if (i > m) {
                m = i;
            }
        }
        return m;
    }
}
