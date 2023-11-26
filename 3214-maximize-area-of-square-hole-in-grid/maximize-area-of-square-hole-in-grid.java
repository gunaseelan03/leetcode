class Solution {
    public int maxgap(int[] bars){
        Arrays.sort(bars);
        int count = 2, max = 2;
        for(int i=1;i<bars.length;i++){
            count = bars[i-1]+1==bars[i]?count+=1:2;
            max = Math.max(max,count);
        }
        return max;
    }
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int gap = Math.min(maxgap(hBars),maxgap(vBars));
        return gap*gap;
    }
}