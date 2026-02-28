package HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArray {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        //[3,-2,1,-5,2,-4]
        int[] result = bruitForceReArrangeArray(nums);
        System.out.println(Arrays.toString(result));

        int[] result1 = optimalRearrangeArrayApproach(nums);
        System.out.println(Arrays.toString(result1));
    }


    private static int[] optimalRearrangeArrayApproach(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[positiveIndex] = num;
                positiveIndex += 2;
            } else {
                result[negativeIndex] =num;
                negativeIndex += 2;
            }
        }
        return result;

    }

    // TC - O(n) SC - O(n) extra space
    private static int[] bruitForceReArrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> positiveElement = new ArrayList<>();
        List<Integer> negativeElement = new ArrayList<>();

        for (int num : nums) {
            if (num > 0) {
                positiveElement.add(n);
            } else {
                negativeElement.add(num);
            }
        }

        int[] result = new int[n];
        int p =0, q=0, i=0;

        while (i < n) {
            result[i++] = positiveElement.get(p++);
            result[i++] = negativeElement.get(q++);
        }
        return result;
    }

}
