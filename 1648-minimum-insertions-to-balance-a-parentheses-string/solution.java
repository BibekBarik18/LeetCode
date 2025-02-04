class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack=new Stack<>();
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            stack.push(s.charAt(i));
            else if(!stack.isEmpty() && i<s.length()-1 && s.charAt(i)==')' && s.charAt(i+1)==')')
            {
                stack.pop();
                i++;
            }
            else if(stack.isEmpty() && i<s.length()-1 && s.charAt(i)==')' && s.charAt(i+1)==')')
            {
                ans++;
                i++;
            }
            else if(!stack.isEmpty() && s.charAt(i)==')')
            {
                ans++;
                stack.pop();
            }
            else if(stack.isEmpty() && s.charAt(i)==')')
            {
                ans+=2;
            }
        }
        return ans+(2*stack.size());
    }
}
