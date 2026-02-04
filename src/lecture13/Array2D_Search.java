package lecture13;

import java.util.Scanner;

public class Array2D_Search {
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

        boolean result = findTarget(arr,12);
        System.out.println(result);

    }

    private static boolean findTarget(int[][] arr, int target) {
        for (int i =0; i<arr.length;i++) {//row
            for (int j =0; j< arr[0].length;j++){//colm
                if (arr[i][j] == target) {
                    return true;
              }
            }
        }
        return false;
    }
}
