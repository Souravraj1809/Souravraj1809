/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left < right){
            int guess = left + (right - left) / 2;
            if(isBadVersion(guess)){
                right = guess;
            }
            else{
                left = guess + 1;
            }
        }
        return left;
    }
}