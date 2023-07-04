public class Task13 {
    public static void main(String[] args) {

        String[] array = {"abc","def","abc","xyz","pippo","pluto"};

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if ((array[i].equals(array[j])&&(i!=j))){
                    System.out.format("La Stringa %s è ripetuta in posizione %d e %d",array[i],i,j);
                }
            }
        }
    }
}
