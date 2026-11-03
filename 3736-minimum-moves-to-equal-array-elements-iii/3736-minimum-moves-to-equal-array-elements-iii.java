class Solution {
    public int minMoves(int[] nums) {
        int maxi = 0;
        for(int i=0;i<nums.length;i++){
           maxi = Math.max(nums[i],maxi);
        }
        int count =0;
        for(int i=0;i<nums.length;i++){
          int diff = maxi - nums[i];
          count+= diff;
        }
        return count;
    }
}