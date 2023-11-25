class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int sum  = 0;
        for(int i:nums)
            sum+=i;
        int res[] = new int[n],lsum=0;
        for(int i=0;i<n;i++){
            int rsum = sum-lsum-nums[i];
            int leftVal = i*nums[i]-lsum;
            int rightVal = rsum-(n-i-1)*nums[i];
            res[i]=leftVal+rightVal;
            lsum+=nums[i];
        }
        return res;
    }
}