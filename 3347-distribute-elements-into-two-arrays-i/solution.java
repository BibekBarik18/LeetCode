class Solution {
    public int[] resultArray(int[] nums) {
        if(nums.length<=2)
        return nums;
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int l=nums[0];
        int r=nums[1];
        for(int i=2;i<nums.length;i++){
            if(l>r)
            {
                arr1.add(nums[i]);
                l=nums[i];
            }
            else
            {
                arr2.add(nums[i]);
                r=nums[i];
            }
            
        }
        System.out.println(arr1);
        System.out.println(arr2);
        int[] ans=new int[nums.length];
        int i=0;
        for(int n:arr1)
        {
            ans[i]=n;
            i++;
        }
        for(int n:arr2)
        {
            ans[i]=n;
            i++;
        }
        return ans;
    }
}
