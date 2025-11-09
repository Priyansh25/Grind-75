package week1.bestTimetoBuyandSellStock;
class Solution {
    public int maxProfit(int[] prices) {

        int []left = new int[prices.length];
        int []right = new int[prices.length];
        left[0] = prices[0];
        right[prices.length-1] = prices[prices.length-1];

        int profit;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 1; i < prices.length; i++) {
            left[i] = Math.min(left[i-1], prices[i]);
        }
        for (int i = prices.length-2; i >= 0; i--) {
            right[i] = Math.max(right[i+1], prices[i]);
        }
        for(int i = 0;i< prices.length; i++) {
            profit = right[i] - left[i];
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
    }

    public static void main() {
        Solution sol = new Solution();

        int [] prices = {7,1,5,3,6,4};
        int ans = sol.maxProfit(prices);
        System.out.println("MaxProfit = " + ans);
    }
}