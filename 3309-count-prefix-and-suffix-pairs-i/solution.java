class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(ispresuf(words[i],words[j]))
                {
                    c++;
                }
            }
        }
        return c;
    }
    boolean ispresuf(String str1,String str2)
    {
        if(str2.length()>=str1.length())
        {
            if(str1.equals(str2.substring(0,str1.length())) && str1.equals(str2.substring(str2.length()-str1.length(),str2.length())))
            {
                return true;
            }
        }
        return false;
    }
}
