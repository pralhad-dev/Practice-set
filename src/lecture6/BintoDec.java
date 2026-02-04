package lecture6;

public class BintoDec {
    public static void main (String[] args) {
        int n = 111001;
        int decimal = 0;

        while (n>0) {
            int lastDigitl = n%10;
            decimal = decimal  * 2 +lastDigitl;
            n = n/10;

        }
        System.out.println(decimal);
    }
}
