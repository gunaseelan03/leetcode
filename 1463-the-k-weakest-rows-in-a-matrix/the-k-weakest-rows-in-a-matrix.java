class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->a[0]!=b[0]?b[0]-a[0]:b[1]-a[1]);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int num:mat[i]){
                if(num==1)
                    count++;
            }
            pq.offer(new int[] {count,i});
            if(pq.size()>k)
                pq.poll();
        }
        int res[] = new int[k];
        while(k-->0)
            res[k]=pq.poll()[1];
        return res;
    }
}