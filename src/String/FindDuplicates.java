package String;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
  public static void main(String[] args) {
    String str = "madam";

    Set<Character> set = new HashSet<>();

    for (char ch : str.toCharArray()) {
      if (!set.add(ch)) {
        System.out.println(ch);
      }
    }
  }
}
