package InterviewPrep;

import java.util.Arrays;

public class MoZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] result = moveZeroToeNd(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZeroToeNd(int[] arr) {
        if (arr == null || arr.length == 0) return arr;

        int j =0;
        for (int i =0; i<arr.length;i++){
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
}
