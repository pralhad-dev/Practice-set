package HomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        printPairs(arr, target);
    }

    private static void printPairs(int[] arr, int target) {
        Arrays.sort(arr);

        int left=0;
        int right =arr.length;

        while(left<right) {
            int sum = arr[left]+arr[right];

            if (sum == target) {
                System.out.println(arr[left]+"and"+arr[right]);
                left++;
                right--;
            } else if(sum < target) {
                left++;
            } else{
                right--;
            }
        }
    }
}
