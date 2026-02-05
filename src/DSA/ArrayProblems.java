package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayProblems {

    //Given an array and a target, return indices of two numbers whose sum is target.
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSumBrute(nums, target)));
        System.out.println(Arrays.toString(twoSumHashMap(nums, target)));
      //  System.out.println(Arrays.toString(twoSumTwoPointer(nums, target)));
    }

    private static int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();

        for (int i =0; i<nums.length;i++){
            int needed = target-nums[i];
            if (map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            map.put(nums[i],i);
            }
        return new int[]{-1,-1};
    }

    private static int[] twoSumBrute(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; i++) {
                if (nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
