class Solution {
    public int maxProfit(int[] prices) {
        int k=Integer.MAX_VALUE;
        int max=0;
        int p=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<k)
            k=prices[i];
            p=prices[i]-k;
            if(p>max)
            max=p;
        }
        return max;
    }
}