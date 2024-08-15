class Solution {
    public int maxProfit(int[] prices) {
        int k=Integer.MAX_VALUE;
        int p=0,max=0;
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






// int d=0;
//         for(int i=0;i<prices.length;i++)
//         {
//             for(int j=i+1;j<prices.length;j++)
//             {
//                 int c=prices[j]-prices[i];
//                 if(c>d)
//                 d=c;
//             }
//         }
//         return d;
