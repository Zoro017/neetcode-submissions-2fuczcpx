class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int j = prices[0];
        int profit = 0;
        

        for(int i = 1 ; i < n ; i++){
            if(j < prices[i]){
                profit += prices[i]-j;
            }
            j = prices[i];
        }

        return profit;
        
    }
}