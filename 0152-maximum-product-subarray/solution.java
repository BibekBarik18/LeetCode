class Solution {
    public int maxProduct(int[] nums) {
        int pre=1,suf=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            pre*=nums[i];
            suf*=nums[nums.length-i-1];
            max=Math.max(max,Math.max(pre,suf));
        }
        return max;
    }
}
