class Solution {
    public int majorityElement(int[] nums) {
        int l=0,r=1;
        int k=nums.length/2;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    r=r+1;
                }
            }
            if(r>k)
            {
                l=nums[i];
            }
            r=0;
        }
        return l;
    }
}