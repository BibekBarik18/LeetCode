class Solution {
    public int maxScore(String s) {
        if(s.length()<=1)
        return s.length();
        int r=1;
        int max=0;
        while(r<s.length())
        {
            int zs=0;
            int l=0;
            while(l<r)
            {
                if(s.charAt(l)=='0')
                zs++;
                l++;
            }
            int os=0;
            int i=r;
            while(i<s.length())
            {
                if(s.charAt(i)=='1')
                os++;
                i++;
            }
            if(max<(zs+os))
            max=zs+os;
            r++;
        }
        return max;
    }
}
