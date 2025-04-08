class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1)
        return;
        int i,j;
        for(i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1])
            break;
        }
        if(i==-1){
            int l=0,m=nums.length-1;
            while(l<m){
            int t=nums[l];
            nums[l]=nums[m];
            nums[m]=t;
            l++;
            m--;
        }
        return;
        }
        for(j=nums.length-1;j>i;j--){
            if(nums[j]>nums[i])
            break;
        }
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
        System.out.println(Arrays.toString(nums));
        int l=i+1,m=nums.length-1;
        while(l<m){
            t=nums[l];
            nums[l]=nums[m];
            nums[m]=t;
            l++;
            m--;
        }
    }
}
