public class Task15 {
    public static void main(String[] args) {
        int[] array1 ={1,2,3,4,5,0};
        int[] array2 = {5,6,7,8,9,0};
        for (int i:array1) {
            for (int j:array2 ) {
                if (i==j){
                    System.out.println(i + " is a common element");
                }
            }
        }
    }
}
