class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int c=0;
        int i=0;
        int l=tickets.length;
        while(tickets[k]!=0){
            if(tickets[i%l]>0){
                tickets[i%l]=tickets[i%l]-1;
                c++;
            }
            i++;
        }

        return c;
    }
}
