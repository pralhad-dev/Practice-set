package Algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindSecondHighest {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    Integer secondHighest = list.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        .skip(1)
        .findFirst()
        .orElse(null);

    System.out.println(secondHighest);
  }
}
