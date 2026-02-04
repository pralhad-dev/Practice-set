package lecture13;

import java.util.Scanner;

public class Array2D_IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i =0; i<arr.length;i++) {//row
            for (int j =0; i< arr[0].length;j++){//colm
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("2D array");


        for (int i =0; i<arr.length;i++) {//row
            for (int j =0; i< arr[0].length;j++){//colm
                System.out.println(arr[i][j] +" ");
            }
            System.out.println(" ");
        }

    }
}
