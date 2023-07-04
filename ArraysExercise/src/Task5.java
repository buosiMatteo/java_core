public class Task5 {
    public static void main(String[] args) {
        int[] numeric = new int[10];
        for (int i = 0; i < numeric.length; i++) {
            numeric[i] = i + 1;
        }
        int value = Integer.parseInt(args[0]);
        boolean isPresent = compare(numeric, value);
        System.out.println(isPresent);
    }

    static boolean compare(int[] ints, int n) {
        for (int anInt : ints) {
            if (anInt == n) {
                return true;
            }
        }
        return false;
    }
}
