package lecture13;

import java.util.Scanner;

public class TransposeArray {
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

        System.out.println("Before Transpose");
        for (int i =0; i<arr.length;i++) {//row
            for (int j =0; j< arr[0].length;j++){//colm
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }


        System.out.println("After Transpose");
        transposeArray(arr);
        for (int i =0; i<arr.length;i++) {//row
            for (int j =0; j< arr[0].length;j++){//colm
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    private static void transposeArray(int[][] arr) {


        for (int i =0 ;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
}
