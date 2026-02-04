package Classes;

public class pattern3 {
    public static void main(String[] args) {
        int n = 5;
        int i = 1;

        while (i <= n) {

            // spaces
            int space = n - i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            int j = 1;
            while (j <= i) {
                System.out.print(j + " ");
                j++;
            }

            System.out.println();
            i++;
        }
    }


}

