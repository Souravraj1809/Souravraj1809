class Solution {
    class Pair{
        int f;
        int s;
        Pair(int first,int second){
            this.f = first;
            this.s = second;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Pair> heap = new PriorityQueue<>(
              (a,b)-> {
                if(a.f != b.f){
                    return b.f - a.f;
                }
                return b.s-a.s;
              }
        );
        int[] res = new int[k];
        for(int i=0;i<mat.length;i++){
            int count =0;
            for(int j=0;j<mat[i].length;j++ ){
                 if(mat[i][j] == 1){
                    count+= 1;
                 }
            }
            if(heap.size() < k){
                heap.add(new Pair(count,i));
            }
            else{
                Pair top = heap.peek();
                if(top.f > count || count == top.f && i < top.s){
                    heap.poll();
                    heap.add(new Pair(count,i));
                }
            }

        }
     for(int i=k-1;i>= 0;i--){
        res[i] = heap.poll().s;
     }
     return res;
    }
}