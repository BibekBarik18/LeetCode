class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> li=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                {
                    int[] arr=new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    li.add(arr);
                }
                
            }
        }
        for(int[] arr:li){
            int i=arr[0];
            int j=arr[1];
            int r=i,l=j;
                    while(r>=0){
                        matrix[r][l]=0;
                        r--;
                    }
                    r=i;
                    while(r<matrix.length){
                        matrix[r][l]=0;
                        r++;
                    }
                    r=i;
                    while(l>=0){
                        matrix[r][l]=0;
                        l--;
                    }
                    l=j;
                    while(l<matrix[0].length){
                        matrix[r][l]=0;
                        l++;
                    }
        }
    }
}
