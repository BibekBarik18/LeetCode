class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> l=new ArrayList<>();
        int n=intervals.length;
        sort(intervals);
        for(int i=0;i<n;i++)
        {
            if(l.isEmpty())
            {
                int[] a=new int[2];
                a[0]=intervals[i][0];
                a[1]=intervals[i][1];
                l.add(a);
            }
            else if(intervals[i][0]>=l.get(l.size()-1)[0] && intervals[i][0]<=l.get(l.size()-1)[1])
            {
                l.get(l.size()-1)[1]=Math.max(intervals[i][1],l.get(l.size()-1)[1]);
            }
            else
            {
                int[] a=new int[2];
                a[0]=intervals[i][0];
                a[1]=intervals[i][1];
                l.add(a);
            }
        }
        int ans[][]=new int[l.size()][2];
        int i=0;
        for(int[] a:l)
        {
            ans[i][0]=a[0];
            ans[i][1]=a[1];
            i++;
        }
        return ans;
    }
    static void sort(int[][] arr)
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j][0]>arr[j+1][0])
                {
                    int t=arr[j][0];
                    int t1=arr[j][1];
                    arr[j][0]=arr[j+1][0];
                    arr[j][1]=arr[j+1][1];
                    arr[j+1][0]=t;
                    arr[j+1][1]=t1;
                }
            }
        }
    }
}
