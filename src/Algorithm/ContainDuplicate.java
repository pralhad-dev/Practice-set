package Algorithm;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,4,1,6,7,8,9,10};
        boolean result = isDuplicate(arr);
        System.out.println(result);

    }

    private static boolean isDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i :arr) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }

        return false;
    }
}
