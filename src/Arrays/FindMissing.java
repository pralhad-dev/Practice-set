package Arrays;

public class FindMissing {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 5};

    int n = 5;

    int expectedSum = n * (n + 1) / 2;
    int actualSum = 0;

    for (int i : arr) {
      actualSum += i;

    }
    System.out.println(expectedSum -actualSum);
  }
}
