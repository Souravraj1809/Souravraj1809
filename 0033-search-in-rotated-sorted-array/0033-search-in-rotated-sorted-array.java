class Solution {

    public int search(int[] nums, int target) {

       int n = nums.length;

       int left = 0;

       int right = n - 1;

       while (left <= right){

        int guess = (left + right)/2;

        if(nums[guess] == target){

            return guess;

        }

        if(nums[guess] > nums[n-1]){

            if(nums[guess] < target){

                left = guess + 1;

            }

            else{

                if(nums[0] > target){

                    left = guess + 1;

                }

                

                else{

                    right = guess - 1;

                }

            }

        }

        else{

            if(nums[guess] > target){

                right = guess - 1;

            }

            else{

                if(nums[n-1] >= target){

                    left = guess + 1;

                }

                else{

                  right = guess - 1;

                }

            }

        }

       }

       return -1;

    }

}