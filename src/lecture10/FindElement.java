package lecture10;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-1,0,19,102};
        int target = 3;

        int result = findElementFromArray(arr,target);
        System.out.println(result);
    }

    private static int findElementFromArray(int[] arr, int target) {

        for (int i =0;i<arr.length;i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
