package lecture9;

public class productNums {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] result = productItSelf(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] productItSelf(int[] arr) {

        int n = arr.length;
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            output[i] = product;
        }

        return output;
    }
}
