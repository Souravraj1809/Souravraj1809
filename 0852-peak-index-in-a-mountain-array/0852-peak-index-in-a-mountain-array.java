class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int greatest = arr[0];
        int peak=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > greatest){
                greatest = arr[i];
                peak = i;
                
            }
        }
     return peak;
    }
}