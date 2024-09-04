class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder ans=new StringBuilder();
        String a=strs[0];
        String b=strs[strs.length-1];
        int i=0;
        while(i<a.length() && i<b.length())
        {
            if(a.charAt(i)==b.charAt(i))
            {
                ans.append(a.charAt(i));
            }
            else
            break;
            i++;
        }
        return ans.toString();
    }
}
