class Solution {
    public int titleToNumber(String columnTitle) {
        int i=columnTitle.length()-1;
        int ans=0,j=0;
        while(i>=0)
        {
            int d=(int)columnTitle.charAt(i)-64;
            ans=ans+d*((int)Math.pow(26,j));
            j++;
            i--;
        }
        return ans;
    }
}
