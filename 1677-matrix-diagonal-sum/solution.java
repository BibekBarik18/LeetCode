class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        for(int i=0;i<mat.length;i++)
        {
            int l=mat.length-i-1;
            if(i!=l)
            {
            s+=mat[i][i];
            s+=mat[i][l];
            }
            else
            s+=mat[i][i];
            l--;
        }
        return s;
    }
}
