package HomeWork;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums = {8,9,9,9};
        int[] result = plusOne(nums);
        for (int n : result) {
            System.out.print(" "+n);
        }
    }

    private static int[] plusOne(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return nums;
        }
        for (int i = len -1; i>=0;i--){
            if (nums[i]< 9) {
                nums[i] = nums[i] +1;
                return nums;
            }
        }
        nums = new int[len+1];
        nums[0] =1;
        return nums;
    }
}
