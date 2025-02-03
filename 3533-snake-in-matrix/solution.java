class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0,j=0;
        for(String command:commands){
            if(command.equals("UP"))
                i--;
            else if(command.equals("DOWN"))
                i++;
            else if(command.equals("RIGHT"))
                j++;
            else if(command.equals("LEFT"))
                j--;
        }
        return (n*i+j);
    }
}
