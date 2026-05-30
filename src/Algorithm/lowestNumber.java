package Algorithm;

import java.util.Arrays;
import java.util.List;

public class lowestNumber {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

    Integer lowest = list.stream().min(Integer::compareTo).orElse(null);
    System.out.println(lowest);
  }
}
