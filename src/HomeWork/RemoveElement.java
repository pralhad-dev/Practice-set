package HomeWork;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        int result = removeElement(arr, val);
        int optimalResult = removeElementOptimalApproach(arr, val);
        System.out.println("result: " + result);
        System.out.println("result: " + optimalResult);
    }

    private static int removeElementOptimalApproach(int[] arr, int val) {
        int n = arr.length;
        int slow = 0;
        for (int i = 0; i < n; i++) {

            if(arr[i] != val) {
                arr[slow] = arr[i];
                slow ++;
            }
        }
        return slow;
    }


    // O(n) - TP & O(n) - SP
    private static int removeElement(int[] arr, int val) {
        int n = arr.length;
        int[] temp = new int[n];
        int k = 0;

        //copy all elements from original array to temp != val 3
        // arr[0] ->3 != 3 - > add
        for (int i = 0; i < n; i++) {
            if (arr[i] != val) {
                temp[k++] = arr[i];
                k++;
            }
        }

        //copy all elements from temp to original
        for (int i = 0; i < k; i++) {
            arr[i] = temp[k];
        }
        return k;
    }


}
