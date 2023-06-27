public class Task6 {
    public static void main(String[] args) {
        int[] numeric = new int[10];
        for (int i = 0; i < numeric.length; i++) {
            numeric[i] = i + 1;
        }
        int value = Integer.parseInt(args[0]);
        for (int i = 0; i < numeric.length; i++) {
            if (numeric[i] == value) {
                System.out.println("The index of value is " + i);
                break;
            }
        }
    }
}
