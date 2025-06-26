class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int s=0;
        int e=matrix.length;
        while(s<e){
            int mid=s+(e-s)/2;
            if(matrix[mid][matrix[0].length-1]>target)
            e=mid;
            else if(matrix[mid][matrix[0].length-1]<target)
            s=mid+1;
            else
            return true;
        }
        if(s>matrix.length-1) return false;
        // System.out.println(s);
        int k=0,l=matrix[0].length-1;
        while(k<l){
            int mid=k+(l-k)/2;
            // System.out.println(mid);
            if(matrix[s][mid]==target) 
            return true;
            else if(matrix[s][mid]<target)
            k=mid+1;
            else if(matrix[s][mid]>target)
            l=mid-1;
        }
        if(matrix[s][k]==target) return true;
        return false;
    }
}
