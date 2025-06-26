// class Pairs{
//     int key;
//     int value;
//     Pairs(int key,int value){
//         this.key=key;
//         this.value=value;
//     }
// }
class Solution {
    public void setZeroes(int[][] matrix) {
        LinkedList<int[]> map=new LinkedList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    int[] arr=new int[2];
                    arr[0]=i;
                    arr[1]=j;
                    map.add(arr);
                }
            }
        }
        for(int[] arr:map)
        {
            int k=arr[0];
            int m=arr[1];
            while(k>=0)
            {
                matrix[k][m]=0;
                k--;
            }       
            k=arr[0];
            while(k<matrix.length)
            {
                matrix[k][m]=0;
                k++;
            } 
            k=arr[0];
            while(m>=0){
                matrix[k][m]=0;
                m--;
            }
            m=arr[1];
            while(m<matrix[0].length){
                matrix[k][m]=0;
                m++;
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
