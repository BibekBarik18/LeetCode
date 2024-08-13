class Solution {
    public void rotate(int[] nums, int k) {
        if(nums.length < k){
            k = k % nums.length;
        }
        int[] s=new int[k];
        int r=0;
        for(int m=nums.length-k;m<nums.length;m++)
        {
            s[r]=nums[m];
            r++;
        }
        for (int i = nums.length - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for(int m = 0; m<k; m++){
            nums[m] = s[m]; 
        }
    }
}
