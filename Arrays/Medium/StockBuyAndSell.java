package Arrays.Medium;

public class StockBuyAndSell {
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            profit = Math.max(profit, prices[i] - minPrice);
        }

        return profit;
    }

    public static void main(String[] args) {
        int[] test = { 7, 6, 4, 3, 1 };
        System.out.println("Profit: " + maxProfit(test));
    }
}
