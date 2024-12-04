class Solution {
    public int search(int[] nums, int target) {
        int p=pivot(nums);
        System.out.println(p);
        if(p==-1)
        return search(nums,target,0,nums.length-1);
        else if(target==nums[p])
        return p;
        else if(target>=nums[0])
        return search(nums,target,0,p-1);
        return search(nums,target,p+1,nums.length-1);
    }
    int search(int[] nums,int target,int s,int e)
    {
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(nums[mid]==target)
            return mid;
            else if(target<nums[mid])
            e=mid-1;
            else
            s=mid+1;
        }
        return -1;
    }
    int pivot(int[] nums)
    {
        int s=0;
        int e=nums.length-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1])
            return mid;
            else if(mid>s && nums[mid]<nums[mid-1])
            return mid-1;
            else if(nums[mid]<=nums[s])
            e=mid-1;
            else
            s=mid+1;
        }
        return -1;
    }
}
