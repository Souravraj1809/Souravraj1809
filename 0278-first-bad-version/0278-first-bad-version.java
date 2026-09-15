/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int ans  = 1;
        while(left <= right){
            int guess = left + (right - left) / 2;
            if(isBadVersion(guess)){
                ans = guess;
                right = guess-1;
            }
            else{
                left = guess + 1;
            }
        }
        return ans;
    }
}