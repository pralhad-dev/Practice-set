package HomeWork;

import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[] inverse = new int[n];

        inverseArray(arr,inverse,0);

        for (int i=0;i<n;i++) {
            System.out.println(inverse[i] + " ");
        }
    }

    private static void inverseArray(int[] arr, int[] inverse, int idx) {

        if (idx ==arr.length) {
            return;
        }
        inverse[arr[idx]] =idx;
        inverseArray(arr,inverse,idx+1);
    }
}
