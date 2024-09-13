class Solution {
    public int getLucky(String s, int k) {
        long ans=0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a' + 1;
            sb.append(num);
        }
        String sum=sb.toString();
        for(int i=0;i<k;i++)
        {
            sum=summer(sum);
        }
        return Integer.parseInt(sum);
    }
    private String summer(String numStr) {
        int sum = 0;
        for(int i=0;i<numStr.length();i++)
        {
            sum=sum+numStr.charAt(i)-'0';
        }
        return Integer.toString(sum);
    }
}
