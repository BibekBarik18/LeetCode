class Solution {
    public void duplicateZeros(int[] arr) {
        int[] ans=new int[arr.length];
        int i=0,j=0;
        while(i<arr.length)
        {
            if(i<arr.length-1 && arr[j]==0)
            {
                ans[i]=0;
                ans[++i]=0;
            }
            else
            {
                ans[i]=arr[j];
            }
            i++;
            j++;
        }
        for(i=0;i<ans.length;i++)
        arr[i]=ans[i];
    }
}
