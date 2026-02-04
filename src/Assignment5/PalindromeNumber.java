package Assignment5;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(isPalindromeNo(s));
    }

    private static boolean isPalindromeNo(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left<right) {
            if (s.charAt(left) !=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
