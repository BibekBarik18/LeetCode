import java.util.Queue;
import java.util.Stack;
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<students.length;i++)
        {
            q.add(students[i]);
        }
        for(int j=sandwiches.length-1;j>=0;j--)
        {
            s.push(sandwiches[j]);
        }
        int count=0;
        while(!s.isEmpty() && count<q.size())
        {
            if(s.peek().equals(q.peek()))
            {
                s.pop();
                q.remove();
                count=0;
            }
            else
            {
                q.add(q.peek());
                q.poll();
                count++;
            }
        }
        return q.size();
    }
}
