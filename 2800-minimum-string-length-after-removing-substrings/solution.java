class Solution {
    public int minLength(String s) {
        if(s.length()==1)
        return 1;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if ((s.charAt(i) == 'B' && !stack.isEmpty() && stack.peek() == 'A') ||
    (s.charAt(i) == 'D' && !stack.isEmpty() && stack.peek() == 'C')) {
    stack.pop();
} else {
    stack.push(s.charAt(i));
}

        }
        return stack.size();
    }
}
