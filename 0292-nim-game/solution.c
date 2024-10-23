bool canWinNim(int n) {
    if(n%2!=0)return true;
    if(n%4==0)return false;
    return true;
}
