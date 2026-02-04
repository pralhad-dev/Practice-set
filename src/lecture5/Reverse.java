package lecture5;

public class Reverse {
    public static void main(String[] args) {
        int n = 3451200;

        int reverse = 0;


        while (n >0) {
            int digits = n %10;
            reverse = reverse *10 +digits;
            n = n/10;
        }
        System.out.println("Reverse of digits:"+reverse);
    }

}
