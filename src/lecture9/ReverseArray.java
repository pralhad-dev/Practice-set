package lecture9;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

    public static void reverse(int[] arr) {
        // TODO Auto-generated method stub

        int[] rev = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            rev[j] = arr[i];
            j++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rev[i];
        }
    }
}
