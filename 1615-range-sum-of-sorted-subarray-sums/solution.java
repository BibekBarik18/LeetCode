class Solution {
    final int MOD=(int)(Math.pow(10,9))+7;
    public int rangeSum(int[] nums, int n, int left, int right) {
        int[] sub=new int[n*(n+1)/2];
        int k=0;
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=nums[j];
                sub[k]=s;
                k++;
            }
        }
        Arrays.sort(sub);
        long s=0;
        for(int i=left-1;i<right;i++){
            s+=sub[i];
        }
        return (int)(s%MOD);
    }
}
