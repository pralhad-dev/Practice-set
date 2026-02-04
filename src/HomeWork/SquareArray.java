package HomeWork;

import java.util.Scanner;

public class SquareArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] squares = sortedSquares(nums);

        for (int val : squares) {
            System.out.print(val + " ");
        }
    }

    private static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1, idx = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[idx] = leftSq;
                left++;
            } else {
                result[idx] = rightSq;
                right--;
            }
            idx--;
        }

        return result;

    }
}
