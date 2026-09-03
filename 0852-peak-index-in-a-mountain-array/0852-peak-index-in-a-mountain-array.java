class Solution {
    public int peakIndexInMountainArray(int[] arr) {
     int low =0;
     int n = arr.length;
     int high = n-1;
     int ans =0;
     while(low <= high){
        int guess = low + (high - low )/2;
        if(arr[guess] < arr[guess + 1]){
            low =  guess + 1;
        }
       else{
         ans = guess;
         high =  guess - 1;
       }
     }
     return ans;
    }
}