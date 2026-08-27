class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> f = new HashMap<>();
        int res = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            f.put(ch,f.getOrDefault(ch,0)+1);
        }
        Boolean hasodd = false;
        for (int count : f.values()){
            res = res + (count /2) * 2;
            if( count % 2 == 1){
                hasodd = true;
            }
           
        }
         if(hasodd){
                res = res + 1;
        }
        return res;
        
    }
}