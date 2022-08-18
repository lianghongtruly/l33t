class Solution {
    public int maxProfit(int[] prices) {
        int soFarMin = prices[0], soFarProfit = 0, profit = 0;
        for ( int i = 1; i < prices.length; i++ ) {
            if ( prices[i] < soFarMin ) soFarMin = prices[i];
            else 
                soFarProfit = Math.max(soFarProfit, prices[i] - soFarMin);
        }
        return soFarProfit;
    }
}