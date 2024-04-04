
class Solution {
    public int maxDepth(String s) {
        int d=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)=='(')
            d+=1;
            else if(s.charAt(i)==')')
            d-=1;
            if(max<d)
            max=d;
        }

        return max;
    }
}
