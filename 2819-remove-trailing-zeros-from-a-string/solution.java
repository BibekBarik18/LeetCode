class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder sb=new StringBuilder();
        int i;
        int r=num.length();
        for(i=num.length()-1;i>=0;i--){
            if(num.charAt(i)=='0')
            {
                r--;
            }
            else
            return num.substring(0,r);
        }
        return num;
    }
}
