class Solution {
    public int hammingDistance(int x, int y) {
        int max=Math.max(x,y);
        int min=Math.min(x,y);
        String maxb=Integer.toBinaryString(max);
        String minb=Integer.toBinaryString(min);
        int c=0,b=0;
        int i=minb.length()-1;
        int j=maxb.length()-1;
        while(i>=0)
        {
            if(maxb.charAt(j)!=minb.charAt(i))
            c++;
            if(maxb.charAt(j)=='1')
            b++;
            i--;
            j--;
        }
        c=c+Integer.bitCount(max)-b;
        return c;
    }
}
