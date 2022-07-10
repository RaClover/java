public class Solution10 {

    /*
    * You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.*/

        public int maxProfit(int[] prices) {

            int n = prices.length;
            int maxProfit = 0;
            int[] maxArray = new int[n];
            int maxTillNow = Integer.MIN_VALUE;

            // calculate max array from right
            for(int i=n-1; i>=0; i--){
                maxTillNow = Math.max(maxTillNow,prices[i]);
                maxArray[i] = maxTillNow;
            }

            for(int i=0; i<n-1; i++)
                maxProfit = Math.max(maxProfit,maxArray[i+1]-prices[i]);
            return maxProfit;
        }

}
