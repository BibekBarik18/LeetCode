class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] arr=new int[2];
        int c=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                if(c>1)
                arr[1]=i;
                else
                arr[0]=i;
            }
        }
        if((c==0 || c==2) && s1.charAt(arr[0])==s2.charAt(arr[1]) && s1.charAt(arr[1])==s2.charAt(arr[0]))
        return true;
        else 
        return false;
    }
}
