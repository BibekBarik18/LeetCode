class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int i=0,j=0,max=0;
        while(j<s.length()){
            while(set.contains(s.charAt(j)) && i<j){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            if(set.size()>max) max=set.size();
            j++;
        }
        return max;
    }
}
