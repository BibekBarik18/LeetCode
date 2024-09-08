class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        if(n==1 || n==7)
        return true;
        int b=n;
        while(n>9)
        {
        sum=square(n);
        System.out.println(sum);
        if(sum==1 || sum==7)
        return true;
        n=sum;
        }
        return false;
    }
    public int square(int n)
    {
        int s=0,d=0;
        while(n>0)
        {
            d=n%10;
            s=s+d*d;
            n=n/10;
        }
        return s;
    }
}
