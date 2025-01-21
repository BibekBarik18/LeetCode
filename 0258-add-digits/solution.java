class Solution {
    public int addDigits(int num) {
        while(num>=10)
        {
            int s=0;
            int a=num;
            while(a>0)
            {
                int d=a%10;
                s=s+d;
                a=a/10;
            }
            if(s<10)
            return s;
            else
            num=s;
        }
        return num;
    }
}
