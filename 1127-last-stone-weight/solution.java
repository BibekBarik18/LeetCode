class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int w:stones)
        {
            q.add(w);
        }
        while(q.size()!=1 && !q.isEmpty())
        {
            int y=q.poll();
            int x=q.poll();
            if(x!=y)
            q.add(y-x);
        }
        if(q.size()==1)
        return q.poll();
        return 0;
    }
}
