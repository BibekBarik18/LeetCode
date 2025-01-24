class Solution {
    public int numWaterBottles(int nb, int ne) {
        int s=nb;
        while(nb>=ne)
        {
            int d=nb/ne;
            int r=nb%ne;
            s+=d;
            nb=d+r;
        }
        return s;
    }
}
