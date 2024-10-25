class Solution {
    public char findTheDifference(String s, String t) {
        char[] ch=s.toCharArray();
        char[] ts=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ts);
        for(int i=0;i<s.length();i++)
        {
            if(ch[i]!=ts[i])
            {
                System.out.println(ch[i]+" "+ts[i]);
                return ts[i];
            }
        }
        return ts[ts.length-1];
    }
}
