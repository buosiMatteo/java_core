public class Task1 {
    public static void main(String[] args) {
        int[] numeric = {1, 4, 10, 2, 2, 4};

        for (int j = 1; j < numeric.length; j++) {
            for (int i = 0; i < numeric.length - j; i++) {
                if (numeric[i] > numeric[i + 1]) {
                    int x = numeric[i];
                    numeric[i] = numeric[i + 1];
                    numeric[i + 1] = x;
                }
            }
        }

        for (int i : numeric) {
            System.out.println(i);
        }
        String[] strings = {"zzz", "zyz", "abc", "lmn", "bcd"};
        for (int j = 0; j < strings.length; j++) {
            for (int i = 0; i < strings.length - 1; i++) {
                if (strings[i].compareToIgnoreCase(strings[i + 1]) > 0) {
                    String s = strings[i];
                    strings[i] = strings[i + 1];
                    strings[i + 1] = s;
                }
            }
        }


        for (String s : strings) {
            System.out.println(s);
        }
    }

}
