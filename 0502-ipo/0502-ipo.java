class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        int n = profits.length;
        ArrayList<int[]> proj = new ArrayList<>();
        for(int i=0;i< n;i++){
            proj.add(new int[]{capital[i],profits[i]});
        }
        proj.sort((a,b)-> Integer.compare(a[0],b[0]));
        int idx = 0;
        while(k-- > 0){
           
            while(idx < n && proj.get(idx)[0] <= w){
                heap.add(proj.get(idx)[1]);
                idx++;
            }
            if(heap.isEmpty()){
                return w;
            }
            int pro = heap.poll();
            
            w += pro;
        }
        return w;
    }
}