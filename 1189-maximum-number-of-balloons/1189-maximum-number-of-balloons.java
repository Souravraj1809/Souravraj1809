class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> f = new HashMap<>();
        HashMap<Character,Integer> s = new HashMap<>();
        s.put('b',1);
        s.put('a',1);
        s.put('l',2);
        s.put('o',2);
        s.put('n',1);
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            f.put(ch,f.getOrDefault(ch,0)+1);
        }
        int count =Integer.MAX_VALUE;
        for(char ch : s.keySet()){
            if(!f.containsKey(ch)){
                return 0;
            }
            count = Math.min(count,f.get(ch)/s.get(ch));

        }
        return count;
        
      
    }
}