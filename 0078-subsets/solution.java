class Solution {
    List<List<Integer>> out=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        sub(0,nums,nums.length,new ArrayList<>());
        return out;
    }
    public void sub(int i,int[] arr,int n,List<Integer> li){
        if(i==n)
        {
            out.add(new ArrayList<>(li));
            System.out.println(li+" "+out);
            return;
        }
        li.add(arr[i]);
        sub(i+1,arr,n,li);
        li.remove(li.size()-1);
        sub(i+1,arr,n,li);
        return;
    }
}
