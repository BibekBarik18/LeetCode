class Solution {
    public int maximumCount(int[] nums) {
        int c=0,r=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0)
            c++;
            else if(nums[i]==0)
            r++;
            else
            break;
        }
        if(c+r>nums.length/2)
        return c;
        else 
        return nums.length-(c+r);
    }
}
