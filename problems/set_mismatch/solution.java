class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] n=new int[2];
        for(int i=1;i<=nums.length;i++)
        {
            int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==i)
                {
                    c++;
                }
            } 
            if(c==2)
            {
                n[0]=i;
            }
            else if(c==0)
            {
                n[1]=i;
            }
        }
        return n;
    }
}