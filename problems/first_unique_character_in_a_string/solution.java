class Solution {
    public int firstUniqChar(String s) {
        int c=0,ans=-1;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char a=s.charAt(i);
            
            for(int j=0;j<i;j++)
            {
                char b=s.charAt(j);
                if(a==b)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
            for(int j=i+1;j<l;j++)
            {
                char b=s.charAt(j);
                if(a==b)
                {
                    c=1;
                    break;
                }
            }
            if(c==0)
            {
                ans=i;
                break;
            }
            }
            c=0;
        }
        return ans;
    }
}