package lecture6;

public class DeciToBin {
    public static void main(String[] args) {
        int n =13;
        int binary = 0;
        int power = 1;

        while (n > 0) {
            int digit = n %2;
            binary = binary + digit *power;
            power = power *10;

            n = n/2;
        }
        System.out.println(binary);
    }
}
