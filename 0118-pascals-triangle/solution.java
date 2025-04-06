class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> pre=new ArrayList<>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                l.add(1);
                else
                {
                    l.add(pre.get(j)+pre.get(j-1));
                }
            }            
            ans.add(l);
            pre=l;
        }
        return ans;
    }
}
