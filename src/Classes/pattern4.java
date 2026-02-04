package Classes;

public class pattern4 {
    public static void main(String[] args) {
            int n = 5;
            int i = 1;

            while (i <= n) {
                int space = n - i;

                while (space > 0) {
                    System.out.print("  ");
                    space--;
                }

                int j = 1;

                while (j <= (2 * i - 1)) {
                    if (j % 2 == 0) {
                        System.out.print(i);
                    } else {
                        System.out.print(i);
                    }
                    j++;
                }

                System.out.println();
                i++;
            }
        }


}
