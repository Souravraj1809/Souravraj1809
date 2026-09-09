class Solution {
    public long countCommas(long n) {
        long start = 1000;
        long comma = 1;
        long ans = 0;
        while(start <= n){
            long end = Math.min( n,start*1000 -1);
            ans += (end - start + 1) * comma;
            start *=1000;
            comma++;
        }
        return ans;
    }
}