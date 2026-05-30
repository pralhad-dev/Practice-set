package String;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicated {
  public static void main(String[] args) {
    String str = "programming";

    Set<Character> set = new LinkedHashSet<>();

    for (char c : str.toCharArray()) {
      if (!set.add(c));
    }
    StringBuilder sb = new StringBuilder();

    for (char c :set) {
      sb.append(c);
    }
    System.out.println(sb);
  }
}
