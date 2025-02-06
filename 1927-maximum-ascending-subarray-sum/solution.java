class Solution {
    public int maxAscendingSum(int[] nums) {
        int s=nums[0],max=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1]){
                if(s>max)
                max=s;
                s=nums[i];
            }
            else
            {
                s+=nums[i];
            }
        }
        if(s>max)
        return s;
        else
        return max;
    }
}
