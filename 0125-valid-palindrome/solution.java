class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sr=new StringBuilder();
        String s1=s.toLowerCase();
        for(int i=0;i<s1.length();i++)
        {
            int a=(int)s1.charAt(i);
            if(a>=97 && a<=122 || a>=48 &&a<=57  )
            sr.append(s1.charAt(i));
        }
        System.out.println(sr);
        if(sr.toString().equals(""))
        return true;
        else if(sr.toString().equals(sr.reverse().toString()))
        return true;
        else
        return false;
    }
}
