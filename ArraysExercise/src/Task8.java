public class Task8 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[10];

        for (int i = 0; i < array1.length; i++) {
            array1[i]=2*i;
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i]=array1[i];
        }

        for (int i:array2) {
            System.out.println(i);
        }
    }
}
