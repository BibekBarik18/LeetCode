class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<allowed.length();i++)
        {
            stack.push(allowed.charAt(i));
        } 
        int k=0;
        while(k<words.length)
        {
            for(int j=0;j<words[k].length();j++)
            {
                if(!stack.contains(words[k].charAt(j)))
                {
                    System.out.println(words[k].charAt(j));
                    c++;
                    break;
                }
            }
            k++;
        }
        return words.length-c;
    }
}
