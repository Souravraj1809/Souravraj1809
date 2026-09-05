class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = nums[0];
        int n = nums.length;
        int[] suffixmin = new int[n];
        suffixmin[n-1] = nums[n-1];
        for(int i = n-2; i >= 0;i--){
            suffixmin[i] = Math.min(nums[i],suffixmin[i+1]);
        }
        for(int i =0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            int score = max - suffixmin[i];
            if(score <= k){
                return i;
            }
        }
        return -1;
    }
}