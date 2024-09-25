class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char[] c=new char[s.length()];
        char[] c1=new char[t.length()];
        c=s.toCharArray();
        c1=t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c);
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=c1[i])
            return false;
        }
        return true;
    }
}
