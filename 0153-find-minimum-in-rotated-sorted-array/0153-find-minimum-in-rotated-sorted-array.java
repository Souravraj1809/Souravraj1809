class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int n = nums.length;
        int right = n-1;
       while(left < right){
            int guess = left +  (right - left)/2;
        if(nums[guess] > nums[right]){
               left = guess + 1;
        }
        else{
           
            right = guess;
        }
       }
       return nums[left];
    }
}