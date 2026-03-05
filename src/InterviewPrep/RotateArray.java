package InterviewPrep;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;
        int[] result = rotate(arr,k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] rotate(int[] arr, int k){

        int n = arr.length;
        k = k %n;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);

        return arr;
    }

    private static void reverseArray(int[] arr,int start,int end){
        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
        }
    }

//    private static int[] rotateArray(int[] arr,int k) {
//        int n = arr.length;
//        int[] result = new int[n];
//
//        for (int i =0; i<n;i++) {
//            result[(i+k)%n] =  arr[i];
//        }
//
//        for (int i =0; i<n;i++) {
//            arr[i] = result[i];
//        }
//        return result;
//    }
}
