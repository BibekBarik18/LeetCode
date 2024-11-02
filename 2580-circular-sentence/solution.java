class Solution {
    public boolean isCircularSentence(String s) {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && s.charAt(i+1)!=s.charAt(i-1))
            return false;
            else if(i==s.length()-1 && s.charAt(i)!=s.charAt(0))
            return false;
        }
        return true;
    }
}
