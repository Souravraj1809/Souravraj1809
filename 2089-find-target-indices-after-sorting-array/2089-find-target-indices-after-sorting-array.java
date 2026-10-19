class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        while(low <= high){
            int guess = low + (high - low)/2;
            if(nums[guess] == target){
                int first = guess;
                while(first > 0 && nums[first - 1] == target){
                    first--;
                }
                while(first < nums.length && nums[first] == target){
                    
                    list.add(first);
                    first++;
                }
                return list;
            }
            else if(nums[guess] > target){
                   high = guess - 1;
            }
            else{
               low = guess + 1;
            }
        }
        return list;
    }
}