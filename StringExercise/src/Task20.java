public class Task20 {

    public static void main(String[] args) {

        String str1 = "This is a String";
        String str2 = "This is a string";
        String str3 = "This is a String";
        boolean isS1EqualsS2 = str1.equals(str2);
        boolean isS1EqualsS3 = str1.equals(str3);
        System.out.printf("str1 == str2? %b\n", isS1EqualsS2);
        System.out.printf("str1 == str3? %b\n", isS1EqualsS3);

        if (str1 == str3) {
            System.out.println("FUNZIONA");
        }
    }
}
