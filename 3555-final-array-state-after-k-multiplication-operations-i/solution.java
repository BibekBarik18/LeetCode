class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int min=0;
        for(int i=0;i<k;i++)
        {
            for(int j=nums.length-1;j>=0;j--)
            {
                if(nums[min]>=nums[j])
                    min=j;
            }
            nums[min]*=multiplier;
        }
        return nums;
    }
}
