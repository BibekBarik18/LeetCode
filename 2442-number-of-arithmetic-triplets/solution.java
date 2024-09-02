class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Stack<Integer> stack=new Stack<>();
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]-nums[i]==diff+diff)
                {
                    System.out.println(nums[j]-diff);
                    for(int k=0;k<nums.length;k++)
                    {
                        if(nums[j]-diff==nums[k] && stack.search(nums[j]-diff)==-1)
                        {
                            stack.push(nums[j]-diff);
                            c++;
                        }
                    }
                }
            }
        }
        return c;
    }
}
