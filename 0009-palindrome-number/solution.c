bool isPalindrome(int x){
long c,r=0,d;
c=x;
while(x>0)
{
    d=x%10;
    r = (r*10) + d;
    x=x/10;
}
if(r==c)
return true;
else
return false;
}
