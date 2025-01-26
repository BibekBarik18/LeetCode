class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        TreeSet<Integer> set1=new TreeSet<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i]))
            set1.add(nums2[i]);
        }
        int[] ans=new int[set1.size()];
        int i=0;
        for(int a:set1){
            ans[i]=a;
            i++;
        }
        return ans;
    }
}
