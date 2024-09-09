class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        return sea(nums,target,s,e);
    }
    public int sea(int[] nums,int target,int s,int e)
    {
        if(s>e)
        return-1;
        int m=s+(e-s)/2;
        if(nums[m]==target)
        return m;
        else if(nums[m]<target)
        return sea(nums,target,m+1,e);
        return sea(nums,target,s,m-1);
    }

}
