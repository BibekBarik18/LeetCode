class Solution {
    public int splitArray(int[] nums, int k) {
        int s=Integer.MIN_VALUE;
        int e=0;
        for(int num:nums)
        {
            s = Math.max(s, num);
            e+=num;
        }
        while(s<e)
        {
            int mid=s+(e-s)/2;
            int sum=0;
            int piece=1;
            for(int num:nums)
            {
                if(sum+num>mid)
                {
                    sum=num;
                    piece++;
                }
                else
                sum+=num;
            }
            if(piece<=k)
            {
                e=mid;
            }
            else
            s=mid+1;
        }
        return s;
    }
}
