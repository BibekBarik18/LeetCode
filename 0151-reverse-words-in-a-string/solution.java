class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        StringBuilder sb=new StringBuilder();
        int r=s.length();
        for(int l=s.length()-1;l>=0;l--)
        {
            if(s.charAt(l)==' ')
            {
                sb.append(s.substring(l+1,r));
                sb.append(" ");
                while(s.charAt(l-1)==' ')
                {
                    l--;
                }
                r=l;
            } 
            else if(l==0)
            {
                sb.append(s.substring(l,r));
            }
        }
        return sb.toString();
    }
}
