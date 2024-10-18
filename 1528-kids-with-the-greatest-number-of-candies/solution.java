class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> extra=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            max=candies[i];
        }
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies>=max)
            extra.add(true);
            else
            extra.add(false);
        }
        LinkedList<Boolean> list=new LinkedList<>(extra);
        return list;
    }
}
