class Solution {
    class pair{
        int f;
        char s;
        pair(int first,char second){
            this.f = first;
            this.s = second;
        }
    }
    public String reorganizeString(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>(
         (a,b)-> b.f - a.f
        );
        for(char ch : map.keySet()){
            pq.add(new pair(map.get(ch),ch));
        }
        StringBuilder res = new StringBuilder();
        pair prev = null;
        while(!pq.isEmpty()){
            pair curr = pq.poll();
           res.append(curr.s);
            curr.f--;

            if (prev != null && prev.f > 0) {
                pq.offer(prev);
            }

            prev = curr;
        }

        if (res.length() != s.length()) {
            return "";
        }
     return res.toString();   
    }
}