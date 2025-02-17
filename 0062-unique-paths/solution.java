class Solution {
    public int uniquePaths(int m, int n) {
		int r=m;
		int c=n;
		int arr[][]=new int[r+1][c+1];
		
        return grid(r,c,arr);
    }
    static int grid(int r,int c,int[][] arr)
	{
		if(r==1 || c==1)
			return 1;
		if(arr[r][c]!=0) return arr[r][c];
		arr[r][c]=grid(r,c-1,arr)+grid(r-1,c,arr);
		return arr[r][c];
	}
}
