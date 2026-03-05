package InterviewPrep;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String str ="swiss";
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char ch : map.keySet()){
            if (map.get(ch)==1) {
                System.out.println(ch);
                break;
            }
        }
    }
}
