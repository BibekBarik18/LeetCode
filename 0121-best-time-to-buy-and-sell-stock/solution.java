class Solution {
    public int maxProfit(int[] prices) {
        int p=0,min=0;
        for(int i=0;i<prices.length;i++){
            if(prices[min]>prices[i])
            min=i; 
            if(prices[i]-prices[min]>p)
            p=prices[i]-prices[min];
        }
        return p;
    }
}
