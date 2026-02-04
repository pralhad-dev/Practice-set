package lecture10;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,1,2,-1,4,-5};
        int[] result = selectionSort(arr);
        System.out.println(Arrays.toString(result));
//        for (int n : result){
//            System.out.print(n+" ");
//        }
    }
    private static int[] selectionSort(int[] arr) {
        int n=arr.length;

        for (int i =0; i<n-1;i++) {
            int minIndex =i;

            for (int j=i+1; j<n;j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex =j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex] =temp;

        }
        return arr;
    }
}
