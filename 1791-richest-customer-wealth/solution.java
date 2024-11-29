class Solution {
    public int maximumWealth(int[][] accounts) {
        return max(accounts);
    }
    int max(int[][] accounts)
    {
        int max=Integer.MIN_VALUE;
        for(int row=0;row<accounts.length;row++)
        {
            int s=0;
            for(int column=0;column<accounts[row].length;column++)
            {
                s+=accounts[row][column];
            }
            max=Math.max(max,s);
        }
        return max;
    }
}
