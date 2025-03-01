class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int[] ans=new int[arr.length];
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            ans[i]=Math.abs(arr[i]-x);
        }
        int s=0;
        for(int i=ans.length-1;i>=ans.length-k;i--)
        {
            s+=ans[i];
        }
        int min=s,mini=ans.length-k;
        for(int i=ans.length-k-1;i>=0;i--)
        {
            s+=ans[i]-ans[i+k];
            if(s<=min)
            {
                min=s;
                mini=i;
            }
        }
        for(int i=mini;i<mini+k;i++)
        l.add(arr[i]);
        return l;
    }
}
