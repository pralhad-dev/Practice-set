package InterviewPrep;

public class FindSecLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int secondLargest = findSecLargest(arr);
        System.out.println(secondLargest);
    }
    public static int findSecLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second =  Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num !=first) {
                second = num;
            }
        }

        return second;
    }
}
