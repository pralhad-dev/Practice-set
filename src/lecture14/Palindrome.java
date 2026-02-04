package lecture14;

public class Palindrome {
    public static void main(String[] args) {
        String s = "madam";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }

    private static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while (start<end) {
            if (s.charAt(start) !=s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
