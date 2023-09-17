class Solution {
    public int shortestPathLength(int[][] graph) {
    final int n = graph.length;
    final int expected = (1 << n) - 1;
    final boolean[][] visited = new boolean[n][expected + 1];
    final Queue<int[]> queue = new LinkedList<>();
    final Map<Integer, List<Integer>> map = new HashMap<>();
    int result = 0;
    for(int i = 0; i < n; i++) {
        queue.offer(new int[]{i, 1 << i});
        map.putIfAbsent(i, new ArrayList<>());
        for(int e: graph[i]) {
            map.putIfAbsent(e, new ArrayList<>());
            map.get(i).add(e);
            map.get(e).add(i);
        }
    }

    while(!queue.isEmpty()) {
        final int size = queue.size();
        for(int i = 0; i < size; i++) {
            final int[] c = queue.poll();
            final int index = c[0];
            final int bitmask = c[1];
            if(bitmask == expected) return result;
            if(visited[index][bitmask]) continue;
            visited[index][bitmask] = true;
            List<Integer> next = map.get(index);

            for(int e: next) {
                final int b = 1 << e;
                final int nextBitmask = bitmask | b;
                queue.offer(new int[]{e, nextBitmask});
            }
        }
        result++;
    }
    return result;
}
}