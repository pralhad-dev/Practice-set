package InterviewPrep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] removeDuplicates(int[] arr) {

        Set<Integer> set = new HashSet<>();

        for (int i :arr) {
            if (set.contains(i)) {
                set.remove(i);
            }
            set.add(i);
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
