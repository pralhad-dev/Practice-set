package lecture16;

public class factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = factorialNumber(n);
        System.out.println(result);
    }

    private static int factorialNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int fact = factorialNumber(n - 1);
        return fact * n;

    }

}
