class Solution {
    public int compress(char[] chars) {
        int c=1;
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<chars.length;i++)
        {
            if(chars[i]==chars[i-1])
            c++;
            else
            {
                sb.append(chars[i-1]);
                if(c!=1)
                sb.append(c);
                c=1;
            }
        }
        sb.append(chars[chars.length-1]);
        if(c!=1)
        sb.append(c);
        String s=sb.toString();
        for(int i=0;i<s.length();i++)
        {
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
}
