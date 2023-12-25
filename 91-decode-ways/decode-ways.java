class Solution {
    
    public int numDecodings(String s) {
        int n = s.length();
        if(s.charAt(0)=='0')
            return 0;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return decode(s,n,0,dp);
    }
    public int decode(String s ,int n ,int p,int[] dp){
        if(p==n)
            return 1;
        if(s.charAt(p)=='0')
            return 0;
        if(dp[p]!=-1)
            return dp[p];
        int res = decode(s,n,p+1,dp);
        if(p<n-1 && (s.charAt(p)=='1' || (s.charAt(p)=='2' && s.charAt(p+1)-'0'<=6)))
            res+=decode(s,n,p+2,dp);
        return dp[p]=res;
    }
}