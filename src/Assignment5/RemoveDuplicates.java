package Assignment5;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(removeDuplicate(s));

    }

    private static String removeDuplicate(String s) {
        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));

        for (int i=1; i <s.length();i++){
            if (s.charAt(i) !=s.charAt(i-1)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();

    }
}
