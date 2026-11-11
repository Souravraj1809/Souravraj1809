class Solution {
    public int fib(int n) {
        if(n==0 || n==1){
            return n;
        }

      int value = fib(n-1) + fib(n-2);
      return value;
    }
}