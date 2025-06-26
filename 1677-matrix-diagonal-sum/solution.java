class Solution {
    public int diagonalSum(int[][] matrix) {
            int i=0,j=0,s=0;
            while(i<matrix.length){
                s+=matrix[i][j];
                i++;
                j++;
            }
            i=0;
            j=matrix[0].length-1;
            while(i<matrix.length){
                if(matrix.length%2!=0 && i==(i+j)/2){
                    i++;
                    j--;
                    continue;
                }
                s+=matrix[i][j];
                i++;
                j--;
            }
            return s;
    }
}
