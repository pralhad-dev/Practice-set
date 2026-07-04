package Basics;

public class FibSeries {
  public static void main(String[] args) {
    int n = 10;

    int first = 0, second = 1;

    for (int i = 1; i <= n; i++) {
      int temp = first + second;
      first = second;
      second = temp;

      System.out.println(temp);

    }

  }
}
