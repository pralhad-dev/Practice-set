package Algorithm;

public class ReverseString {
  public static void main(String[] args) {
    String str = "abcde";

    String reverseString = new StringBuilder(str)
        .reverse().toString();
    System.out.println(reverseString);
  }
}
