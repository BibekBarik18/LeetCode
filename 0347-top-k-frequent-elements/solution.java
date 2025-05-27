class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int c=0,i=0;
        for(i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<int[]> arr=new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            arr.add(new int[]{entry.getValue(),entry.getKey()});
        }

        arr.sort((a,b)->b[0]-a[0]);
        int l=0;
        int[] ans=new int[k];
        for(int[] a:arr){
            if(l==k) break;
            ans[l]=a[1];
            l++;
        }
        return ans;
    }
}
