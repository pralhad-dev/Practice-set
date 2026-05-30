package Algorithm;

import java.util.Arrays;
import java.util.List;

public class AvgNumber {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    double avg = list.stream().mapToLong(Integer::intValue)
        .average().orElse(0);
    System.out.println(avg);
  }
}
