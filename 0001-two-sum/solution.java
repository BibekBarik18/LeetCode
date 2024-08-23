class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a=0;
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                a=nums[j]+nums[i];
                if(target == a)
                {
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }
}
