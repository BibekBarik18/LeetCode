class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        int i=0;
        while(i<nums.length-2){
            if(nums[i]==0){
                c++;
                nums[i]=nums[i]^1;
                nums[i+1]=nums[i+1]^1;
                nums[i+2]=nums[i+2]^1;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
        for(i=0;i<nums.length;i++){
            if(nums[i]==0)
            return -1;
        }
        return c;
    }
}
