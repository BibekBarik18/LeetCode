import java.util.Stack;
class Solution {
    public String makeGood(String s) {
    StringBuilder sb=new StringBuilder();
    sb.append(s);
    int flag=0;
    while(flag==0&&sb.length()>0)
    {
        flag=1;
        for(int i=0;i<sb.length()-1;i++)
        {
        if(Integer.valueOf(sb.charAt(i))==Integer.valueOf(sb.charAt(i+1))+32||Integer.valueOf(sb.charAt(i))==Integer.valueOf(sb.charAt(i+1))-32)
        {
            sb.delete(i,i+2);
            flag=0;
        }
        }
    }
    return sb.toString();
    }
}
