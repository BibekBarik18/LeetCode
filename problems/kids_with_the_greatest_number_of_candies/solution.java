class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        LinkedList<Boolean> a=new LinkedList<Boolean>();
        int max=max(candies);
        for(int i=0;i<candies.length;i++)
        {
            int val=candies[i]+extraCandies;
            if(val>=max)
            a.add(true);
            else
            a.add(false);
        }
        return a;
    }
    int max(int[] a)
    {
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            max=a[i];
        }
        return max;
    }
}