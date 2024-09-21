class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String merge = s1 + " " + s2;
        String[] arr=merge.split(" ");
        ArrayList<String> ans=new ArrayList<>();
        int i=0;
        for(String c: arr)
        {
            if(!map.containsKey(c))
            map.put(c,i++);
            else if(map.containsKey(c))
            map.put(c,i+2);
            i=0;
        }
        for(String c:arr)
        {
            if(map.get(c) == 0)
            ans.add(c);
        }
        return ans.toArray(new String[0]);
    }
}
