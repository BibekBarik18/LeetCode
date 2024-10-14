class Solution {
    int c=0;
    public int numberOfSteps(int num) {
        if(num==0)
        return c;
        else if(num%2==0)
        {
            c++;
        return numberOfSteps(num/2);}
        else
        {
            c++;
        return numberOfSteps(num-1);}
    }
}
