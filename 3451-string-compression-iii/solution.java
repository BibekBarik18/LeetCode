class Solution {
    public String compressedString(String word) {
        int c=1;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i)==word.charAt(i-1))
            {c++;}
            if(c>9)
            {
                sb.append(c-1);
                sb.append(word.charAt(i-1));
                c=1;
            }
            else if(word.charAt(i)!=word.charAt(i-1))
            {
                sb.append(c);
                sb.append(word.charAt(i-1));
                c=1;
            }
        }
        sb.append(c);
        sb.append(word.charAt(word.length()-1));
        return sb.toString();
    }
}
