class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int n = piles.length;
        int maxCoins = 0;
        for(int i=n-2;i>=(n-i)/2;i-=2){
            maxCoins+=piles[i];
        }
        return maxCoins;    }
}