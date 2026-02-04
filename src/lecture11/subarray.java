package lecture11;

public class subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int start = 0; start < arr.length; start++) {

            for (int end = start; end < arr.length; end++) {

                // Print elements from start to end
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }

    }
}
