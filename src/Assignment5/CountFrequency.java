package Assignment5;

import java.util.Scanner;

public class CountFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }

        char ans = s.charAt(0);
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)] > max) {
                max = freq[s.charAt(i)];
                ans = s.charAt(i);
            }
        }

        System.out.println(ans);
        sc.close();
    }
}
