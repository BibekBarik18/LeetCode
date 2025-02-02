class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String sentence:sentences){
            String[] s=sentence.split(" ");
            if(s.length>max){
                max=s.length;
            }
        }
        return max;
    }
}
