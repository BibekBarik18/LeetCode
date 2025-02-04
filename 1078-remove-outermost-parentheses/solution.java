class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack=new Stack<>();
        int d=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
            d++;
            else if(s.charAt(i)==')')
            d--;
            if(d>1)
            stack.push(s.charAt(i));
            else if(d==1 && s.charAt(i)==')')
            stack.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty())
        sb.append(stack.pop());
        return sb.reverse().toString();
    }
}
