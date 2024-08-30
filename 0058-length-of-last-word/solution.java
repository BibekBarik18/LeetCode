class Solution {
    public int lengthOfLastWord(String s) {
        s = s.replaceAll("\\s+$", "");
        char ci=' ';
        int c=0;
        int i=s.length()-1;
        while(i>=0 && s.charAt(i)!=ci)
        {
            c++;
            i--;
        }
        return c; 
    }
}
