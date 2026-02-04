package lecture13;

import java.util.Scanner;

public class ColmWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for (int i =0; i<arr.length;i++) {//row
            for (int j =0; j< arr[0].length;j++){//colm
                arr[i][j]=sc.nextInt();
            }
        }

    }

    private static void transposeArray(int[][] arr) {

    }
}
