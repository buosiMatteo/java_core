public class Task14 {
    public static void main(String[] args) {
        String[] array1 ={"abc","def","xyz","pippo","pluto"};
        String[] array2 = {"qwe","rty","pippo","abc"};
        for (String s:array1) {
            for (String z:array2 ) {
                if (s.equals(z)){
                    System.out.println(s + " is a common element");
                }
            }
        }
    }
}
