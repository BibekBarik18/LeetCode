class Solution {
    public int removeElement(int[] nums, int val) {
        int r=nums.length-1,c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<=r;j++)
            {
                if(nums[j]==val)
                {
                    int t=nums[j];
                    nums[j]=nums[r];
                    nums[r]=t;
                    r--;
                    c++;
                }
            }
        }
        return nums.length-c;
    }
}
