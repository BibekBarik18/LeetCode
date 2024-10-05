class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<s1.length();i++)
            {
            if(!map.containsKey(s1.charAt(i)))
                map.put(s1.charAt(i),1);
                else
                {
                    map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
                }
            }
        for(int i=0;i<s2.length()-s1.length()+1;i++)
        {
            StringBuilder sb=new StringBuilder();
            for (int j=i;j<i+s1.length();j++)
            {
                sb.append(s2.charAt(j));
            }
            sb.toString();
            
            HashMap<Character,Integer> map1=new HashMap<>();
            for(int k=0;k<sb.length();k++)
            {
                if(!map1.containsKey(sb.charAt(k)))
                map1.put(sb.charAt(k),1);
                else
                {
                    map1.put(sb.charAt(k),map1.get(sb.charAt(k))+1);
                }
            }
            if(map.equals(map1))
            return true;
        }
        return false;
    }
}
