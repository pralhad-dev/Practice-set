package lecture9;

public class ArrayProb1 {
    public static void main(String[] args) {
        int[] arr = {20,30,50,70,10};
        int maxMarks = maxMarks(arr);
        System.out.println("Max Marks:" +maxMarks);

    }
    public static int maxMarks(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0 ;i <arr.length;i++) {
            if (arr[i] >max) {
                max = arr[i];
            }
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0 ;i <arr.length;i++) {
            if (arr[i] <min) {
                min = arr[i];
            }
        }
        return min;
    }
}
