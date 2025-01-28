class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i].equals("+"))
            {
                if(s.size()>=2)
                {
                    int n=s.pop();
                    int m=s.pop();
                    s.push(m);
                    s.push(n);
                    s.push(n+m);
                }
            }
            else if(operations[i].equals("C"))
            {
                s.pop();
            }
            else if(operations[i].equals("D"))
            {
                int n=s.pop();
                s.push(n);
                s.push(n*2);
            }
            else
            s.push(Integer.parseInt(operations[i]));
        }
        int sum=0;
        while(s.size()>0){
            sum+=s.pop();
        }
        return sum;
    }
}
