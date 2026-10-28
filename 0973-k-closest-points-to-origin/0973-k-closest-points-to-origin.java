
import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a, b) -> Long.compare(
                distance(b), distance(a)
            )
        );

        for (int[] point : points) {
            heap.add(point);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[][] res = new int[k][];

        for (int i = 0; i < k; i++) {
            res[i] = heap.poll();
        }

        Arrays.sort(res, (a, b) ->
            Long.compare(distance(a), distance(b))
        );

        return res;
    }

    private static long distance(int[] p) {
        long x = p[0];
        long y = p[1];
        return x * x + y * y;
    }
}
