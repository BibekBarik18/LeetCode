class FindSumPairs {
    int nums1[];
    int nums2[];
    Map<Integer,Integer> map2=new HashMap<>();
    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1=nums1.clone();
        this.nums2=nums2.clone();
        for(int i=0;i<nums2.length;i++){
            map2.put(nums2[i],map2.getOrDefault(nums2[i],0)+1);
        }
    }
    
    public void add(int index, int val) {
        map2.put(nums2[index],map2.get(nums2[index])-1);
        nums2[index]+=val;
        map2.put(nums2[index],map2.getOrDefault(nums2[index],0)+1);
    }
    
    public int count(int tot) {
        int c=0;
        for(int  i=0;i<nums1.length;i++){
            if(map2.containsKey(tot-nums1[i])){
                c+=map2.get(tot-nums1[i]);
            }
        }
        return c;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */
