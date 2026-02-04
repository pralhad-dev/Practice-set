package Classes;

public class pattern30 {
    public static void main(String[] args) {
        int n = 5;

        int rows = 5;
        int i = 1;
        while (i <= rows) {
            int num = n;

            while (num >= 1) {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
            i++;

        }

    }
}
