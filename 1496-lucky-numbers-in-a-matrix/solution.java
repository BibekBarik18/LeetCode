class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=0;
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]<matrix[i][min])
                {
                    min=j;
                }
            }
            int max=0;
            for(int l=1;l<matrix.length;l++){
                if(matrix[l][min]>matrix[max][min])
                max=l;
            }
            
            if(max==i)
            arr.add(matrix[max][min]);
        }
        return arr;
    }
}
