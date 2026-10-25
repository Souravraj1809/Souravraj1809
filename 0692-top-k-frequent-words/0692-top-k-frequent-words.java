class Solution {
    class Pair{
        int f;
        String s;
        public Pair(int first,String second){
            this.f = first;
            this.s = second;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        PriorityQueue<Pair> heap = new PriorityQueue<>(
            (a,b)-> {
                if(a.f != b.f){
                   return a.f - b.f;
                }
    
            return b.s.compareTo(a.s);
          });
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(String word : map.keySet()){
            Pair curr = new Pair(map.get(word),word);
              if(heap.size() < k){
                heap.add(curr);
              }
              else if ((heap.peek().f < map.get(word)) || ((heap.peek().f == curr.f) && (curr.s.compareTo(heap.peek().s) < 0) )){
                 heap.poll();
                 heap.add(curr);
              }
        }
         List<String> result  = new ArrayList<>();
         for(int i =0;i<k;i++){
           result.add(0,heap.poll().s);
         }
         return result;  
        }
    }
