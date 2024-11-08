class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] pre=new int[nums.length];
        int k=(int)Math.pow(2,maximumBit)-1;
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            pre[i]=pre[i-1]^nums[i];
        }
        int[] ans=new int[nums.length];
        int j=nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
            ans[j]=k^pre[i];
            j--;
        }
        return ans;
    }
}
