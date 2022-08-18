class Solution {
    public int maxProfit(int[] prices) {
        int buybuy = prices[0];
        int maxProfit = 0;
        //int profit = 0;
        for(int i = 1; i < prices.length; i++){
            if(buybuy < prices[i]){
                maxProfit = Math.max(maxProfit, prices[i] - buybuy);
            }
            else{
                buybuy = prices[i];
            }
        }
        return maxProfit;
    }
}