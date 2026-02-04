package Algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static  int[] twoSum(int target, int[] num) {
        Map<Integer,Integer>  map = new HashMap<>();

        for (int i = 0; i< num.length;i++){
            int complement = target - num[i];
            if (map.containsKey(complement)) {
               return new int[] {map.get(complement),i};
            }

            map.put(num[i],i);
        }
        return new int[]{};

    }

    public static void main (String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 9;
        int[] result = twoSum(target,nums);
        System.out.println(Arrays.toString(result));

    }
}
