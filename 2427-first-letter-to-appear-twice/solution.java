class Solution {
    public char repeatedCharacter(String s) {
        char c='\0';
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(stack.search(s.charAt(i))==-1)
            stack.push(s.charAt(i));
            else
            return s.charAt(i);
        }
        return c;
    }
}
