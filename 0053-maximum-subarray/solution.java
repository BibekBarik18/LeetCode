class Solution {
    public int maxSubArray(int[] nums) {
        int s=0,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(s<0) s=0;
            s+=nums[i];
            if(s>max) max=s;
        }
        return max;
    }
}
