class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=nums[nums[i]-1])
            {
                swap(nums,i,nums[i]-1);
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                arr[0]=nums[j];
                arr[1]=j+1;
                return arr;
            }
        }
        return arr;
    }
    void swap(int[] nums,int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
