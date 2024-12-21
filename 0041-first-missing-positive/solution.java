class Solution {

    public int firstMissingPositive(int[] nums)

    {

        

        int i=0;

        while(i<nums.length)

        {

            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[nums[i]-1])

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

            return j+1;

        }

        return nums[nums.length-1]+1;

    }

    void swap(int[] nums,int i,int j)

    {

        int t=nums[i];

        nums[i]=nums[j];

        nums[j]=t;

    }

}
