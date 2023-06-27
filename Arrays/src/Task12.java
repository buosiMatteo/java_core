public class Task12 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 4, 5, 6, 8, 9};

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if ((array[i]==array[j]&&(i!=j))){
                    System.out.format("il numero %d e ripetuto in posizione %d e %d",array[i],i,j);
                }
            }
        }
    }
}
