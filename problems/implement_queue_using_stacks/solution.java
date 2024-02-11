import java.util.Stack;
class MyQueue {
    Stack<Integer> first=new Stack<Integer>();
    Stack<Integer> second=new Stack<Integer>();

    public MyQueue() {

    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        int poped=second.pop();
        while(!second.isEmpty())
        first.push(second.pop());
        return poped;
    }
    
    public int peek() {
        while(!first.isEmpty())
        {
            second.push(first.pop());
        }
        int peek=second.peek();
        while(!second.isEmpty())
        first.push(second.pop());
        return peek;
    }
    
    public boolean empty() {
        boolean x=false;
        if(first.isEmpty() && second.isEmpty())
        x=true;
        else if(!first.isEmpty() && !second.isEmpty())
        x=false;
        return x;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */