class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        int i=s.length()-1;
        while(i>=0)
        {
            if(s.charAt(i)=='#')
            {
                int n=((s.charAt(i-2)-'0')*10)+(s.charAt(i-1)-'0');
                sb.append((char)(n+97-1));
                i=i-3;
            }
            else if(s.charAt(i)!='#')
            {
                int n=s.charAt(i)-'0';
                sb.append((char)(n+97-1));
                i--;
            }
        }
        return sb.reverse().toString();
    }
}
