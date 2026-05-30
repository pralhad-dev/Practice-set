package String;

public class Palindrome {
  public static void main(String[] args) {
    String str = "madam";
    String reverse = new StringBuilder(str).reverse().toString();
    boolean isPalindrome = str.equals(reverse);
    System.out.println(isPalindrome);
  }
}
