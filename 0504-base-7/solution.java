class Solution {
    public String convertToBase7(int num) {
        StringBuilder base=new StringBuilder();
        if(num==0) return "0";
        int f=0;
        if(num<0){
            num=Math.abs(num);
            f=1;
        }
        while(num>0){
            base.append(num%7);
            num=num/7;
        }
        if(f==1) return "-"+base.reverse().toString();
        else return base.reverse().toString();
    }
}
