class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))
        return "";
        int gcd=gcd(str1.length(),str2.length());
        return str1.substring(0,gcd);   
    }
    int gcd(Integer s1,Integer s2)
    {
        int r=1;
        while(r!=0)
        {
            r=s1%s2;
            s1=s2;
            s2=r;
        }
        return s1;
    }
}