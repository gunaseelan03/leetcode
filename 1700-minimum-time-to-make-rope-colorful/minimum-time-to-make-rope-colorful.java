class Solution {
    public int minCost(String colors, int[] neededTime) {
        int max = neededTime[0],sum = neededTime[0], res = 0, count =1;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                sum+=neededTime[i];
                max = Math.max(max,neededTime[i]);
                count++;
                continue;
            }
            res+=sum-max;
            sum = neededTime[i];
            max = neededTime[i];
            count = 1;
        }
        if(count>1)
            res+=sum-max;
        return res;
    }
}