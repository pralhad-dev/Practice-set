package String;

public class ReverseString {
  public static void main(String[] args) {
    String str = "madam";

    String reversed  = new StringBuilder(str)
        .reverse()
        .toString();

    System.out.println(reversed);
  }
}
