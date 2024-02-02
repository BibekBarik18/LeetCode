
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        LinkedList<Integer> k=new LinkedList<Integer>();
        Solution sol=new Solution();
        String arr="123456789";
        int l=sol.len(low);
        int h=sol.len(high);
        
        for(int j=l;j<=h;j++)
        {
        int r=j;
        for(int i=0;i<arr.length();i++)
        {
            if(r<=arr.length())
            {
            String temp=arr.substring(i,r);
            int val = Integer.parseInt(temp);
            if(val>high)
            break;
            if(val>=low)
            k.add(val);
            
            r++;
            temp=null;
            }
        }
        }
        return k;

    }
     int len(int k)
    {
        int c=0;
        while(k>0)
        {
            c++;
            k=k/10;
        }
        return c;
    }    
}