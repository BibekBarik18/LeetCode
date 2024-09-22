class Solution {
    public int lengthOfLastWord(String s1) {
        String[] s = s1.split(" ");
        return s[s.length-1].length();
    }
}
