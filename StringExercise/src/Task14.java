public class Task14 {
    public static void main(String[] args) {
        String s1 = "Stephen Edwin King";
        String s2 = "Walter Winchell";
        String s3 = "stephen edwin king";
        boolean s1EqualsS2 = s1.equalsIgnoreCase(s2);
        boolean s1EqualsS3 = s1.equalsIgnoreCase(s3);
        System.out.println("\"" + s1 + "\" equals \"" + s2 + "? " + s1EqualsS2);
        System.out.println("\"" + s1 + "\" equals \"" + s3 + "? " + s1EqualsS3);
    }
}