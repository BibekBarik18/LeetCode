class Solution {
    public boolean canSortArray(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<nums.length;j++)
            {
                if(nums[j]<nums[j-1] && Integer.bitCount(nums[j])!=Integer.bitCount(nums[j-1]))
                {
                    return false;
                }
                else if(nums[j]<nums[j-1] && Integer.bitCount(nums[j])==Integer.bitCount(nums[j-1]))
                {
                    int t=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=t;
                }
            }
        }
        return true;
    }
}
