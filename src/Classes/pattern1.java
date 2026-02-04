package Classes;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
//        Scanner sc = new  Scanner(System.in);
//        int n = sc.nextInt();
//
//        if (n %2 ==0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst =1;
        int nsp = n-1;
        int row =1;

        while (row <= n) {

            //space
            int csp = 0;
            while (csp < nsp) {
                System.out.print("  ");
                csp++;
            }
            int cst =0;
            while (csp<nst) {
                System.out.print("* ");
                cst++;
            }
            System.out.println();
            nst+=2;
            row++;
            nsp--;


        }




    }
}
