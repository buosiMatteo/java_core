public class Task5 {
    public static void main(String[] args) {
        String s1 = "This is exercise 2";
        String s2 = "This is exercise 1";

        if(s1.compareTo(s2)==0){
            System.out.println(s1 + " is equal to "+ s2);
        } else if (s1.compareTo(s2)>0) {
            System.out.println(s1 + " is greater than "+ s2);
        } else {
            System.out.println(s1 + " is lower than " + s2);
        }

    }
}
