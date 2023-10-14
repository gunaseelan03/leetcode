class Solution {
    int dp[][];
    public int min_amt(int[] cost,int[] time,int i,int walls){
        if(walls<=0)
            return 0;
        if(i>=cost.length)
            return (int)1e9;
        if(dp[i][walls]!=0)
            return dp[i][walls];
        int not_take = min_amt(cost,time,i+1,walls);
        int take = cost[i]+min_amt(cost,time,i+1,walls-time[i]-1);
        return dp[i][walls] = Math.min(not_take,take);
    }
    public int paintWalls(int[] cost, int[] time) {
        dp = new int[cost.length][time.length+1];
        return min_amt(cost,time,0,time.length);
    }
}