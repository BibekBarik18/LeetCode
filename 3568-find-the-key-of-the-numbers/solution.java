class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int i=0,k=0,ans=0;
        int c=1;
        while(i<4){
            k=Math.min(num1%10,Math.min(num2%10,num3%10));
            ans=ans+k*c;
            num1/=10;
            num2/=10;
            num3/=10;
            c*=10;
            i++;
        }
        return ans;
    }
}
