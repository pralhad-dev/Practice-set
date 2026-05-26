package Algorithm;

public class MaximumSubarrayKadane {
    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println(result);
    }

    private static int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int num : nums) {
            currentSum = Math.max(currentSum + num, num);
            maxSum = Math.max(maxSum, currentSum);

        }
        return maxSum;
    }
}
