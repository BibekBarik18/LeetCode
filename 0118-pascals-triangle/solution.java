class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> temp=new ArrayList<>();
            int num=1;
            temp.add(num);
            for(int j=1;j<i;j++){
                num=(num*(i-j)/j);
                temp.add(num);
            }
            ans.add(temp);
        }
        return ans;
    }
}
