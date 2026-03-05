package InterviewPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int target = 6;
        int[] index = findTargetIndexes(arr,target);
        System.out.println(Arrays.toString(index));
    }

    //O(n)
    private static int[] findTargetIndexes(int[] arr,int target) {
        Map<Integer, Integer> map =  new HashMap<>();
        for (int i =0;i<arr.length;i++){
            int diff = target -arr[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
