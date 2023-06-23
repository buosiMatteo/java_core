public class Pointer {

    static final Example staticExample = new Example();

    public static void main(String[] args) {
        Example a = new Example();
        Example b = a;

        methodX(a);
        System.out.println(a.x);
    }

    public static void methodX(Example example) {
        methodY(example);
    }

    public static void methodY(Example example) {
        example.x = 15;
    }
}
