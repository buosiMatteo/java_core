public class Task18 {
    public static void main(String[] args) {
        int[] array = {3, 6, 1, 4, 2, 8, 9};
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("The second largest element is " + array[array.length-2]);
    }
}
