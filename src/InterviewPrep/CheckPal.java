package InterviewPrep;

public class CheckPal {
    public static void main(String[] args) {
        String str  = "madam";
        boolean result = isPalindrome1(str);;
        System.out.println(result);
    }

    private static boolean isPalindrome1(String str) {
        char[] arr = str.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right --;
        }
        return true;
    }
}
