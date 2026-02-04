package lecture14;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String s = scanner.next();
        pritSubString(s);

    }

    private static void pritSubString(String s) {

        for (int i =0; i<s.length();i++) {
            for (int j=i;j<s.length();j++) {
                for (int k=i;k<=j;k++){
                    System.out.print(s.charAt(k));
                }
                System.out.println();
            }
        }

    }
}
