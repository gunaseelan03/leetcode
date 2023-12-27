class Solution {
    public int minCost(String colors, int[] neededTime) {
        int max = neededTime[0], res = 0, count =1;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)!=colors.charAt(i-1)){
                max = neededTime[i];
            }
            else{
                res+=Math.min(max, neededTime[i]);
                max=Math.max(max, neededTime[i]);
            }
        }
        return res;
    }
}