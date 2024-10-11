class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())
        return 0;
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int r=1;
        int max=1;
        set.add(s.charAt(0));
        while(r<s.length())
        {
            if(!set.contains(s.charAt(r)))
            {
                set.add(s.charAt(r));
                r++;
                if(r-l>max)
                max=r-l;
            }
            else
            {
                set.remove(s.charAt(l));
                l++;
            }
        }
        return max;
    }
}
