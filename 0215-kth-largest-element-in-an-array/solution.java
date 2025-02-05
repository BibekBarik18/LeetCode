class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int r=nums.length;
        for(int i=0;i<k;i++)
        r--;
        return nums[r];
    }
}
