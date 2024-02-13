class Solution {
    public String firstPalindrome(String[] words) {
        String s="",s1="";
        for(int i=0;i<words.length;i++)
        {
            s=words[i];
            for(int j=0;j<s.length();j++)
            {
                char ch=s.charAt(j);
                s1=ch+s1;
            }
            if(s1.equals(s)==true)
            {
                s1=s;
                break;
            }
            s1="";
        }
        return s1;
    }
}