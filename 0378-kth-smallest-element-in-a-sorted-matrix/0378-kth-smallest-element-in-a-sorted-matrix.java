class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
       ;
       int low =  matrix[0][0];
       int high = matrix[n-1][n-1];
       
       while(low < high){
         int guess = low + (high - low)/2;
         int num  = 0;
         int row = n - 1;
         int col = 0;
          while(row >= 0 && col < n){
           if(matrix[row][col] <= guess){
            num +=  (row + 1);
            col++;
         }
         else{
            row--;
         }
         
       }
       if(num >= k){
             high = guess;
         }
         else{
            low = guess + 1;
         }
       }
       return low; 
    }
}