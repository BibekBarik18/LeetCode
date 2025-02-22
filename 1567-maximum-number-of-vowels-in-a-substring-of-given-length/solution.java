class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int su=0;
        for(int i=0;i<k;i++)
        {
            if(set.contains(s.charAt(i)))
            su++;
        }
        int max=su;
        for(int i=k;i<s.length();i++)
        {
            if(set.contains(s.charAt(i-k)))
            su--;
            if(set.contains(s.charAt(i)))
            su++;
            if(su>max)
            max=su;
        }
        return max;
    }
}
