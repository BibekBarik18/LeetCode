class Solution {
    public void moveZeroes(int[] nums) {
        int l=0;
        int r=1;
        while(r<nums.length)
        {
            if(nums[l]==0 && nums[r]!=0)
            {
                int t=nums[l];
                nums[l]=nums[r];
                nums[r]=t;
                l++;
                r++;
            }
            else if(nums[l]==0 && nums[r]==0)
            {
                r++;
            }
            else
            {l++;
            r++;}
        }
    }
}
