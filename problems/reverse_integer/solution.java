import java.math.*;
class Solution {
    public int reverse(int x) {
        
     
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum = finalNum*10+lastDig;
            x= x/10;
        }
        
        if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
            System.out.println(finalNum);
            return 0;
        }
        
        return (int)finalNum;
  
    }
    
}