package Algorithm;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1,2,2,3,11,4,2,3,3,4,5,5,1,2,5);

    List<Integer> removeDuplicate = list.stream().distinct().toList();
    System.out.println(removeDuplicate);
  }
}
