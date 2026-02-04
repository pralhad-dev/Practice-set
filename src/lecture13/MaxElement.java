package lecture13;

import java.util.Scanner;

public class MaxElement {
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

        int  result = maxElement(arr);
        System.out.println(result);
    }

    private static int maxElement(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length;i++) {
            for (int j =0; j<arr[0].length;j++) {
                if (arr[i][j]>max) {
                    max =arr[i][j];
                }
            }
        }
        return max;
    }
}
