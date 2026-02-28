package HomeWork;

import java.util.Arrays;

public class MovesZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] result = movesZeros(arr);
        int[] optimalResult = moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(optimalResult));
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZeroesToEnd(int[] arr) {
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        return arr;

    }

    private static int[] movesZeros(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        for (int i = 0; i < index; i++) {
            arr[i] = temp[index];
        }

        return temp;
    }


}
