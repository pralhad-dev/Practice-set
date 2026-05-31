package Arrays;

public class SecondLArgest {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;

    for (int i : arr) {
      if (i  > first ) {
        second = first;
        first = i;
      } else if (i > second && i !=first) {
        second = i;
      }
    }
    System.out.println(first);
    System.out.println(second);

  }
}
