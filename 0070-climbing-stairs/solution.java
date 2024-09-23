class Solution {
    static int[] in=new int[1000];
    public int climbStairs(int n) {
        if(n<=2)
        return n;
        if(in[n]!=0)
        return in[n];
        else
        in[n]=climbStairs(n-1)+climbStairs(n-2);
        
        return in[n]; 
    }
}
