package Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    List<Integer> descendingOrder = list.stream().sorted(Comparator.reverseOrder())
        .collect(Collectors.toList());

    System.out.println(descendingOrder);
  }
}
