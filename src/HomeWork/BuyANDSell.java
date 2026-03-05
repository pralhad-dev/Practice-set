package HomeWork;

public class BuyANDSell {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans = buynSell (arr);
        System.out.println(ans);
    }
    public static int buynSell(int[] arr) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : arr) {
            if (price < minPrice) {
                minPrice =price;
            } else {
                maxProfit = Math.max(maxProfit,price-minPrice);
            }
        }
        return maxProfit;
    }
}
