public class Task4 {
    public static void main(String[] args) {
        int[] numeric = {0,1,2,3,4,5,6,7,8,9,10};
        double average;
        int sum=0;
        for (int i: numeric) {
            sum+=i;
        }
        average=sum/(double)numeric.length;
        System.out.println(average);
    }
}
