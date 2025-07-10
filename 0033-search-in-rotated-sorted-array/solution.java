class Solution {
    public int pivot(int[] nums){
        int s=0,e=nums.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]>nums[mid+1]) return mid+1;
            else if(nums[mid]<nums[e]) e=mid;
            else s=mid+1;
        }
        return s;
    }
    public int bsearch(int[] nums,int s,int e,int target){
        while(s<e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) e=mid;
            else s=mid+1;
        }
        if(nums[s]==target) return s;
        return -1;
    }
    public int search(int[] nums, int target) {
        int p=pivot(nums);
        if(nums[p]==target) return p;
        int s=bsearch(nums,0,p,target);
        if(s!=-1) return s;
        s=bsearch(nums,p,nums.length-1,target);
        return s;
    }
}
