class Solution {
    class Pair{
        int f;
        int s;
        Pair(int first , int second){
            f = first;
            s = second;
        }

    }
    public int[] topKFrequent(int[] nums, int k) {
      HashMap<Integer,Integer> map = new HashMap<>();
      PriorityQueue<Pair> heap = new PriorityQueue<>(
      (a,b) -> a.f-b.f
      );
      for(int num : nums){
        map.put(num,map.getOrDefault(num,0)+1);
      }
    for(int num : map.keySet()){
        if(heap.size() < k){
        heap.add(new Pair(map.get(num), num));
        }
        else if(heap.peek().f < map.get(num)){
            heap.poll();
            heap.add(new Pair(map.get(num), num));
        }
     }
     int[] result = new int[k];
     for(int i = 0;i<k;i++){
        result[i] = heap.poll().s;
     }
     return result;
    }
}