package Algorithm;

import java.util.Arrays;
import java.util.List;

public class LargestNumber {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

    Integer highest = list.stream().max(Integer::compareTo).orElse(null);

    System.out.println(highest);
  }
}
