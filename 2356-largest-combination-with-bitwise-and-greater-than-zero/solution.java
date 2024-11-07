class Solution {
    public int largestCombination(int[] candidates) {
        int maxva=0;
        for(int i=0;i<24;i++)
        {
            int c=0;
            for(int j=0;j<candidates.length;j++)
            {
                if((candidates[j]&(1<<i))!=0)
                c++;
            }
            maxva=Math.max(maxva,c);
        }
        return maxva;
    }
}
