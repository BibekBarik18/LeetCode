class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        return true;
        long l=0;
        long r=num;
        while(l<r)
        {
            long mid=(l+r)/2;
            long p=mid*mid;
            if(p==num)
            return true;
            else if(p<num)
            {
                l=mid+1;
            }
            else if(p>num)
            {
                r=mid;
            }
        }
        return false;
    }
}
