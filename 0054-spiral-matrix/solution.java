class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        LinkedList<Integer> arr=new LinkedList<>();
        int top=0,down=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        while(top<=down && left<=right){
            for(int i=left;i<=right;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=down;i++){
                arr.add(matrix[i][right]);
            }
            right--;
            if(top<=down){
                for(int i=right;i>=left;i--){
                    arr.add(matrix[down][i]);
                }
                down--;
            }
            if(left<=right){
                for(int i=down;i>=top;i--){
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}
