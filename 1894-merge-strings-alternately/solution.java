class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int len=word1.length()+word2.length();
        int r=0,l=0;
        for(int i=0;i<len;i++)
        {
            if(r<word1.length())
            {
                ans=ans+word1.charAt(r);
                r++;
            }
            if(l<word2.length())
            {
                ans=ans+word2.charAt(l);
                l++;
            }
        }
        return ans;
    }
}
