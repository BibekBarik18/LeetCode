class Solution {
    public int findCircleNum(int[][] isConnected) {
        int[] visited=new int[isConnected.length];
        int c=0;
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==0){
                c++;
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                while(!q.isEmpty()){
                    int t=q.poll();
                    if(visited[t]==0){
                        visited[t]=1;
                        for(int j=0;j<isConnected.length;j++){
                            if(isConnected[t][j]==1 && t!=j){
                                q.add(j);
                            }
                        }
                    }
                }
                System.out.print("out");
            }
        }
        return c;
    }
}
