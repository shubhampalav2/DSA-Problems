class Solution {
    public int maxProfit(int[] prices) {
    int maxProfit=Integer.MIN_VALUE;
    int buy=prices[0];
    for(int i=0;i<prices.length;i++){
    buy=Math.min(buy,prices[i]);
    int diff=prices[i]-buy;
    maxProfit=Math.max(diff,maxProfit);
    }
    return maxProfit;
    }
}
