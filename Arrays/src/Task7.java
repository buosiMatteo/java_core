public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 1;
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = array[i];
        }
        for (int i = (index + 1); i < array.length; i++) {
            newArray[i-1]=array[i];
        }

        for (int i: newArray) {
            System.out.print(i + " ");
        }
    }

}
