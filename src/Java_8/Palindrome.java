package Java_8;

import java.util.stream.IntStream;

public class Palindrome {
    public static void main(String[] args) {
        String str = "madamww";

        boolean isPalinrome = IntStream.range(0,str.length()/2)
                .allMatch(i->str.charAt(i) == str.charAt(str.length()-i-1));

        System.out.println(isPalinrome);
        //I used IntStream to compare characters symmetrically from both ends, stopping early if mismatch occurs.
    }
}
