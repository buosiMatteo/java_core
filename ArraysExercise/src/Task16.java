public class Task16 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 8, 4, 9};
        int indexToRemove1=0;
        int indexToRemove2=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j] && (i != j))) {
                    indexToRemove1 = i;
                    indexToRemove2 = j;
                }
            }
        }
        int[] newArray = new int[array.length-3];
        if (indexToRemove1<indexToRemove2){
            for (int i = 0; i < indexToRemove1; i++) {
                newArray[i]=array[i];
            }
            for (int i = (indexToRemove1+1); i < indexToRemove2; i++) {
                newArray[i-1]=array[i];
            }
            for (int i = (indexToRemove2+1); i < newArray.length ; i++) {
                newArray[i-1]=array[i];
            }
        } else {
            for (int i = 0; i < indexToRemove2; i++) {
                newArray[i]=array[i];
            }
            for (int i = (indexToRemove2+1); i < indexToRemove1; i++) {
                newArray[i-1]=array[i];
            }
            for (int i = (indexToRemove1+1); i < newArray.length ; i++) {
                newArray[i-1]=array[i];
            }
        }

        for (int i : newArray){
            System.out.print(i + " ");
        }
    }
}
