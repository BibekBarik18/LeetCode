class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]!=nums[nums[i]-1])
            {
                swap(nums,i,nums[i]-1);
            }
            else 
            i++;
        }
        for(int j=0;j<nums.length;j++)
        {
            if((j+1) != nums[j])
            arr.add(j+1);
        }
        return arr;
    }
    void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
