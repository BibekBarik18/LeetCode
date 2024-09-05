class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return -1;
        int c=0;
        for(int i=0;i<haystack.length()-needle.length()+1;i++)
        {
            for(int j=0;j<needle.length();j++)
            {
                if(haystack.charAt(i+j)==needle.charAt(j))
                {
                    c=c+1;
                }
            }
            if(c==needle.length())
            return i;
            c=0;
        }
        return -1;
    }
}
