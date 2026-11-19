class Solution {
    public int maxProfit(int[] prices) {
         int bestbuy=prices[0];
         int maxprice=0;
         for(int i=1;i<prices.length;i++){
            if(prices[i]>bestbuy){
                int profit=prices[i]-bestbuy;
                maxprice=Math.max(profit,maxprice);
            }
            else{
                bestbuy=Math.min(prices[i],bestbuy);
            }
         }
        return maxprice;
    }
}
