class Solution {
    public int strStr(String haystack, String needle) {
        int l=needle.length();
        int k=haystack.length(),m=-1;
        String str;
        if(l<=k)
        {
        str=haystack.substring(0,l);
        
        if(str.equals(needle)==true)
        return 0;
        
        l=l+1;
        for(int i=1;i<k;i++)
        {
            if(l<=k)
            {
            str=haystack.substring(i,l);
            System.out.println(str);
            if(str.equals(needle)==true)
            {
            m=i;
            break;
            }
            }
            l++;
        }
        }
        return m;
    }
}