class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Character> map_t=new HashMap<>();
        HashMap<Character,Character> map_s=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map_s.containsKey(s.charAt(i)))
            {
                if(t.charAt(i)!=map_s.get(s.charAt(i)))
                return false;
            }
            else if(map_t.containsKey(t.charAt(i)))
            {
                if(s.charAt(i)!=map_t.get(t.charAt(i)))
                return false;
            }
            else
            {map_s.put(s.charAt(i),t.charAt(i));
            map_t.put(t.charAt(i),s.charAt(i));}
        }
        return true;
    }
}
