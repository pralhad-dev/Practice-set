package lecture16;

public class SumOfN {
    public static void main(String[] args) {
        int n =5;
        int result = printSum(n);
        System.out.println(result);
    }

    private static int printSum(int n) {
        if (n ==0) {
            return 0;
        }

        return n+printSum(n-1);

    }
}
