package InterviewPrep;

public class MAxProfit {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(arr);
        System.out.println(result);
    }

    private static int maxProfit(int[] price) {

        int min = price[0];
        int max = 0;

        for (int i = 1; i < price.length; i++) {
            if (price[i] < min) {
                min = price[i];
            } else {
                int maxProfit = price[i] - min;
                max = Math.max(max, maxProfit);
            }
        }
        return max;
    }

}
