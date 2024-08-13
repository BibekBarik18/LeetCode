class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                c++;
            }
            if(c>=nums.length/2)
            {
                k=nums[i];
                break;
            }
            c=0;
        }
        return k;
    }
}
