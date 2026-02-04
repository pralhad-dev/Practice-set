package lecture14;

import java.util.Scanner;

public class GoodString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int resultMax = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) =='e' || s.charAt(i) =='i' || s.charAt(i) =='o' || s.charAt(i) =='u'){
                ans++;
                resultMax= Math.max(resultMax,ans);
            } else {
                ans =0;
            }

        }

        System.out.println(resultMax);
    }
}
