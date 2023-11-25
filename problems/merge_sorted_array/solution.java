class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0;
        for(int i=m;i<m+n;i++)
        {
            nums1[i]=nums2[k];
            k++;
        }
        for(int i=0;i<m+n;i++)
        {
            for(int j=1;j<(m+n)-i;j++)
            {
                if(nums1[j]<nums1[j-1])
                {
                    int t=nums1[j];
                    nums1[j]=nums1[j-1];
                    nums1[j-1]=t;
                }
            }
        }
    }
}