class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0;
        int j=0;
        List<int[]> ans=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i][0]==nums2[j][0]){
                int[] arr=new int[2];
                arr[0]=nums1[i][0];
                arr[1]=nums1[i][1]+nums2[j][1];
                ans.add(arr);
                i++;
                j++;
            }
            else if(nums1[i][0]<nums2[j][0]){
                int[] arr=new int[2];
                arr[0]=nums1[i][0];
                arr[1]=nums1[i][1];
                ans.add(arr);
                i++;
            }
            else if(nums1[i][0]>nums2[j][0])
            {
                int[] arr=new int[2];
                arr[0]=nums2[j][0];
                arr[1]=nums2[j][1];
                ans.add(arr);
                j++;
            }
        }
        while(i<nums1.length){
            int[] arr=new int[2];
            arr[0]=nums1[i][0];
            arr[1]=nums1[i][1];
            ans.add(arr);
            i++;
        }
        while(j<nums2.length){
            int[] arr=new int[2];
            arr[0]=nums2[j][0];
            arr[1]=nums2[j][1];
            ans.add(arr);
            j++;
        }
        int[][] anss=new int[ans.size()][2];
        int k=0;
        for(int[] ann:ans){
            anss[k][0]=ann[0];
            anss[k][1]=ann[1];
            k++;
        }
        return anss;
    }
}
