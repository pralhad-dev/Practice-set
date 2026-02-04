package lecture14;

public class StringDemo {
    public static void main(String[] args) {
        String s = "Hello ";
        String t = "Hello";

        boolean ans = compareValue(s,t);
        System.out.println(ans);
    }

    private static boolean compareValue(String s, String t) {
        if (s.length() !=t.length()) {
            return false;
        }
       for (int i= 0;i<s.length();i++) {
           if (s.charAt(i) !=t.charAt(i)) {
               return false;
           }
       }
        return true;
    }
}
