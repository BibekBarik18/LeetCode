class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr=new ArrayList<>();
        double ans=0;
        for(int i=0;i<nums1.length;i++)
        {
            arr.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++)
        {
            arr.add(nums2[i]);
        }
        Collections.sort(arr);
        if(arr.size()%2!=0)
        ans=arr.get(arr.size()/2);
        if(arr.size()%2==0)
        ans=(double)(arr.get(arr.size()/2)+arr.get(arr.size()/2-1))/2;
        return ans;
    } 
}
