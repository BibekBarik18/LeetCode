class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int min=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum<min)
            min=sum;
        }
        
        return 1-min;
    }
}
