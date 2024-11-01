class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=s.length-1;
        int j=g.length-1;
        int c=0;
        while(i>=0 && j>=0)
        {
            if(s[i]>=g[j])
            {
                c++;
                i--;
                j--;
            }
            else
            j--;
        }
        return c;
    }
}
