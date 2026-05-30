package Algorithm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,3,1,2,3,5,6,7,4,1,100,2,23,12);

    List<Integer> sorted =list.stream().
        distinct()
        .sorted()
        .collect(Collectors.toList());
    System.out.println(sorted);

  }
}
