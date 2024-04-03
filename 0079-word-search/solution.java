class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        int r,c;
        for(r=0;r<m;r++)
        {
            for(c=0;c<n;c++)
            {
                if(dfs(board,word,r,c,0))
                return true;
            }
        }
        return false;
    }

    boolean dfs(char[][] board,String word, int r,int c,int idx)
    {
        if(r<0 || c<0 || r>=board.length || c>=board[0].length || board[r][c] != word.charAt(idx))
        return false;

        if(idx==word.length()-1)
        return true;

        char ch=board[r][c];
        board[r][c]=' ';

        boolean res=dfs(board,word,r+1,c,idx+1) || 
        dfs(board,word,r-1,c,idx+1)  ||
        dfs(board,word,r,c+1,idx+1)  ||
        dfs(board,word,r,c-1,idx+1);   
        

        board[r][c]=ch;
        return res;
    }
}
