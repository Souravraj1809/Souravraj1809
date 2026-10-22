class Solution {
    public int findKthPositive(int[] arr, int k) {
      int low = 0;
      int high = arr.length-1;
      while(low <= high){
        int guess = low + (high - low)/2;
        int missing = arr[guess] - (guess+1);
        if(missing < k ){
           low = guess + 1;
        }
        else{
           high = guess - 1;
        }
      }
      return low + k;
    }
}