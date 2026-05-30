package Algorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenNumbers {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

    List<Integer> result = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    System.out.println(result);

    /// //////////////////////////////////////////
    List<Integer> res = list.stream().filter(n -> n > 2).toList();
    System.out.println(res);

    ///  ////////////////////////////////////////////////////////////////

    List<String> names = Arrays.asList("java", "spring", "kafka");

    List<String> toUpper = names.stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());

    System.out.println(toUpper);

/// /////////////////////////////////////////////////

    List<Integer> list1 = Arrays.asList(1,2,3,4,2,5,3,6);

    Set<Integer> set = new HashSet<>();

    List<Integer> findDuplicate = list1.stream()
        .filter(n -> !set.add(n))
        .collect(Collectors.toList());

    System.out.println(findDuplicate);

  }
}
