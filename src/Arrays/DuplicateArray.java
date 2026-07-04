package Arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    Set<Integer> set = new HashSet<>();

    for (int i : arr) {
      if (!set.add(i)) {
        System.out.println(i);
      }
    }

  }
}
