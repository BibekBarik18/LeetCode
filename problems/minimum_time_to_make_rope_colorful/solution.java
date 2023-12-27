class Solution {
    public int minCost(String colors, int[] neededTime) {
        int k=0,m=0,n=0;
        for(int i=colors.length()-1;i>0;i--)
        {
            char c=colors.charAt(i-1);
            char l=colors.charAt(i);
            if(l==c)
            {
                k=neededTime[i];
                m=neededTime[i-1];
                if(k<=m)
                {
                n=n+k;
                neededTime[i]=m;
                }
                else if(m<=k)
                {
                n=n+m;
                neededTime[i-1]=k;
                }
            }
            
        }
        return n;
    }
}