package Algorithm;

public class Palindrome {
  public static void main(String[] args) {
    String str = "madam";

    String str1 = new StringBuilder(str).reverse().toString();

    boolean isPalindrome = str.equals(str1);
    System.out.println(isPalindrome);
  }
}
