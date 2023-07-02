public class Task16 {

    public static void main(String[] args) {

        String s1 = "the new String equals This is a sample String";

        byte[] array = new byte[s1.length()];

        for (int i = 0; i < s1.length(); i++) {
            array[i] = (byte) s1.charAt(i);
        }

        for (byte b : array)
            System.out.print(b + " ");
    }
}
