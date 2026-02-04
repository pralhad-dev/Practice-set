package HomeWork;

import java.util.Scanner;

public class ProductItSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long[] result = productExceptSelf(arr);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i]);
            if (i < n - 1) System.out.print(" ");
        }
    }

    private static long[] productExceptSelf(int[] arr) {
        int n = arr.length;
        long[] output = new long[n];

        long prefix = 1;
        for (int i = 0; i < n; i++) {
            output[i] = prefix;
            prefix *= arr[i];
        }

        long suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            output[i] *= suffix;
            suffix *= arr[i];
        }

        return output;
    }
}
