package lecture5;

public class sumOfDigits {
    public static void main(String[] args) {

        int n=  34512;

       int sum = 0;
       while (n >0) {
           int digits = n %10;
           sum +=digits;
           n = n/10;
       }
        System.out.println("Sum of digits:"+sum);
    }
}
