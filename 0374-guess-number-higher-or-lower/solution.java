/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long l=0;
        long r=n;
        while(l<r)
        {
            long mid=(l+r)/2;
            if(guess((int)mid)==0)
            return (int)mid;
            else if(guess((int)mid)==1)
            l=mid+1;
            else if(guess((int)mid)==-1)
            r=mid;
        }
        return (int)r;
    }
}
