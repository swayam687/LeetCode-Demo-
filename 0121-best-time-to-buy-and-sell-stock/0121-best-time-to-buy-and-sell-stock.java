class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxpr = 0;
        int minpr = prices[0];

        for(int i = 0; i < n; i++){
            minpr = Math.min(minpr, prices[i]);
            maxpr = Math.max(maxpr, prices[i] - minpr);
        }
        return maxpr;
    }
}