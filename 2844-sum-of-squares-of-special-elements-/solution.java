class Solution {
    public int sumOfSquares(int[] nums) {
        int s=0;
        int i=1;
        for(int num:nums){
            if(nums.length%i==0)
            {
                s+=num*num;
            }
            i++;
        }
        return s;
    }
}
