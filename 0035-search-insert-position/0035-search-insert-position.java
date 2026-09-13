class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int ans = 0;
        while(low <= high){
            int guess = low + (high - low)/ 2;
            if(nums[guess] == target){
                ans = guess;
                break;
            }
            else if(nums[guess] > target){
                   ans = guess;
                   high = guess - 1;
            }
            else if(nums[guess] < target){
                  ans = guess + 1;
                  low = guess + 1;
            }
        }
     return ans;   
    }
}