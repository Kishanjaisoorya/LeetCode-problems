class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int l = prices[0];
        int a = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] < l) {
                l = prices[i];
            } 
            else if (prices[i] - l > a) {
                a = prices[i] - l;
            }
        }
        return a;
    }
}