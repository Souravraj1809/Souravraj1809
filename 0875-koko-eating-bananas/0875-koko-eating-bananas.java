class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int max = piles[0];
        for(int i=1;i<n;i++){
            max = Math.max(max,piles[i]);
        }
        int high = max;
        int res = -1;
        while(low <= high){
            int guess = (low + high) /2;
            long hour = fun(piles,n,guess);
            if( hour > h){
              low = guess + 1;
            }
            else{
                res = guess;
                high = guess - 1;
            }
        }
    return res;
    }
    private long fun(int[] piles,int n,int speed){
            long h =0;
            for(int i =0;i<n;i++){
                h = h + piles[i]/speed;
                if(piles[i] % speed != 0){
                    h++;
                }
            }
            return h;
        }
}