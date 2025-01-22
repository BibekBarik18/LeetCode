class Solution {
    public String toHex(int num1) {
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb=new StringBuilder();
        long num=num1;
        if(num==0) return "0";
        if(num < 0)
        {
            num=(long)Math.pow(2, 32) + num ;
        }
        while(num>0)
        {
            sb.append(map[(int)Math.abs(num%16)]);
            num=(long)num/16;
        }
        return sb.reverse().toString();
    }
}
