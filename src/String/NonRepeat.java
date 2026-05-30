package String;

import java.util.HashMap;
import java.util.Map;

public class NonRepeat {
  public static void main(String[] args) {
    String str = "aabbcdde";

    Map<Character,Integer> map = new HashMap<>();

    for (char ch : str.toCharArray()) {
      map.put(ch,map.getOrDefault(ch,0)+1);
    }

    for (Map.Entry<Character,Integer> entry : map.entrySet()) {
      if (entry.getValue()==1) {
        System.out.println(entry.getKey());
        break;
      }
    }

  }
}
