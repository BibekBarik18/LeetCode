class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans=new int[nums.length];
        int l=0;
        int r=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0)
            {
                ans[l]=nums[i];
                l++;
            }
            else
            {
                ans[r]=nums[i];
                r--;
            }
        }
        return ans;
    }
}
