class Solution {
    public String digitSum(String s, int k) {
    while(s.length() > k){
        int low = 0;
        int high = k-1;
        String nextsum ="";
       while(low < s.length()){
            int sum = 0;
           for(int j = low ;j<= high && j< s.length() ;j++){
               sum += s.charAt(j) - '0';
             
           }
           nextsum += sum;
           low = high + 1;
           high = high  + k;
        }
        s = nextsum;

       
      
    }
     return s; 
    }
}