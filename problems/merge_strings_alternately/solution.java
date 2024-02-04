class Solution {
    public String mergeAlternately(String word1, String word2) {
        char a=0,b=0;
        String ans="";
        for(int i=0;(i<word1.length())||(i<word2.length());i++)
        {
            if(i<word1.length())
            {
            a=word1.charAt(i);
            ans=ans+a;
            }
            if(i<word2.length())
            {
            b=word2.charAt(i);
            ans=ans+b;
            }
            
            a=0;
            b=0;
        }
        return ans;
    }
}