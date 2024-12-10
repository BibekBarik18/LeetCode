class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s=sentence.split(" ");
        for(int i=0;i<s.length;i++)
        {
            if(s[i].length()>=searchWord.length())
            {
                if(s[i].substring(0,searchWord.length()).equals(searchWord))
                return i+1;
            }
        }
        return -1;
    }
}
