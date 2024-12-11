class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] chrs=new char[s.length()+spaces.length];

        int j=0;
        for(int i=0; i<s.length(); i++){
            if(j<spaces.length && i==spaces[j]){
                chrs[i+j]=' ';
                j++;
            }
            chrs[i+j]=s.charAt(i);
        }

        return new String(chrs);
    }
}
