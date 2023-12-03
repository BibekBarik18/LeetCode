class Solution {
    public int lengthOfLastWord(String s1) {
        String s=s1.trim();
        char c;
        int b=0;
        int l=s.length();
        for(int i=l-1;i>=0;i--)
        {
            c=s.charAt(i);
            if(c!=' ')
            {
                b++;
            }
            else 
            break;
        }
        return b;
    }
}