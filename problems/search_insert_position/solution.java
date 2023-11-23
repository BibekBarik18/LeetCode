class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        int v=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]<=target)
            {
                
                if(nums[i]==target)
                break;
                v=v+1;
            }
        }
        return v;
    }
}