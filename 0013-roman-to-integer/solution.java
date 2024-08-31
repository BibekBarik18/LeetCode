class Solution {
    public int romanToInt(String so) {
        int s=0;
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<so.length();i++)
        {
            if(i<so.length()-1 && map.get(so.charAt(i)) <map.get(so.charAt(i+1)))
            s-=map.get(so.charAt(i));
            else
            s+=map.get(so.charAt(i));
        }
        return s;
    }
}
