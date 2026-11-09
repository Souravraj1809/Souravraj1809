class Solution {
    class Pair{
        int f;
        char s;
        Pair(int first,char second){
            this.f = first;
            this.s = second;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        int len = tasks.length;
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> free = new HashMap<>();
        PriorityQueue<Pair> heap = new PriorityQueue<>(
            (a,b) -> {
            if(a.f != b.f){
                return  Integer.compare(b.f, a.f);
            }
            return Character.compare(b.s, a.s);
        });
        
        for(char ch : tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);
            free.put(ch,1);
        }
        for(char ch : map.keySet()){
          heap.add(new Pair(map.get(ch),ch));
        }
        int seat = 1;
        while(!heap.isEmpty()){
            ArrayList<Pair> pulled = new ArrayList<>();
            while(!heap.isEmpty()){
                Pair p = heap.poll();
                int freq = p.f;
                char child = p.s;
                if(free.get(child) <= seat){
                    if(p.f > 1){
                        heap.add(new Pair(p.f - 1,p.s));
                        free.put(child,seat + n + 1);
                      
                    }
                    break;
                }
                else{
                    pulled.add(p);
                }
            }
            for(int i = 0;i<pulled.size();i++){
                heap.add(pulled.get(i));
            }
            seat++;
        }
    return seat-1;
    }
}