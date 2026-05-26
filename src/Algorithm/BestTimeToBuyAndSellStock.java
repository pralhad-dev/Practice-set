package Algorithm;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        int result = maxProfit1(prices);

        System.out.println(result);
    }

    private static int maxProfit1(int[] prices) {
        int minPrice =Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice,price);
            maxProfit =Math.max(maxProfit,price - minPrice);

        }
        return maxProfit;
    }
}
