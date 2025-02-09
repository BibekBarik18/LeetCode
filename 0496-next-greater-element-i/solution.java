class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums1.length;i++){
            int max=nums1[i];
            int r=nums2.length;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i])
                r=j;
                if(j>=r)
                {
                    if(nums2[j]>max)
                    {
                        max=nums2[j];
                        break;
                    }
                }
            }
            if(max!=nums1[i])
            ans[i]=max;
        }
        return ans;
    }
}
