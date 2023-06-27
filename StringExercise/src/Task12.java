public class Task12 {
    public static void main(String[] args) {
        String s1 = "Python Exercises";
        String s2 = "Python Exercise";
        String s3 = "se";
        boolean s1EndWithS3=s1.endsWith(s3);
        boolean s2EndWithS3=s2.endsWith(s3);
        System.out.println(s1 + " ends with \"se\"? " + s1EndWithS3);
        System.out.println(s2 + " ends with \"se\"? " + s2EndWithS3);

    }
}
