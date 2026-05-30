package String;

import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedChar {
  public static void main(String[] args) {
    String str = "aabbcdde";

    Set<Character> set = new HashSet<>();

    for (char ch : str.toCharArray()) {
      if (!set.add(ch)) {
        System.out.println(ch);
        break;
      }
    }

  }
}
