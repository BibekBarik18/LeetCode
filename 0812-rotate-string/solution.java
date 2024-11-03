class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String so=s.concat(s);
        for(int i=0;i<so.length()-goal.length()+1;i++)
        {
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<goal.length();j++)
            {
                sb.append(so.charAt(i+j));
            }
            if(sb.toString().equals(goal))
            return true;
        }
        return false;
    }
}
