class Solution {
    public long pickGifts(int[] gifts, int k) {
        int i=0;
        int max=0;
        while(i<k)
        {
            for(int j=0;j<gifts.length;j++)
            {
                if(gifts[max]<gifts[j])
                {
                    max=j;
                }
            }
            gifts[max]=(int)Math.floor(Math.sqrt(gifts[max]));
            i++;            
        }
        long s=0;
        for(int gift:gifts)
        s+=gift;
        return s;
    }
}
