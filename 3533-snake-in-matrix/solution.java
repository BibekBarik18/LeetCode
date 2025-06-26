class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int s=0;
        for(String st:commands){
            if(st.equals("DOWN"))
            s+=n;
            else if(st.equals("RIGHT"))
            s+=1;
            else if(st.equals("LEFT"))
            s-=1;
            else
            s-=n;
        }
        return s;
    }
}
