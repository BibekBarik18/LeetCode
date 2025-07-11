class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans=new int[nums.length];
        Arrays.fill(ans,1);
        for(int i=nums.length-2;i>=0;i--){
            ans[i]=nums[i+1]*ans[i+1];
        }
        int p=nums[0];
        for(int i=1;i<nums.length-1;i++){
            ans[i]=p*ans[i];
            p*=nums[i];
        }
        ans[nums.length-1]=p;
        return ans;
    }
}
