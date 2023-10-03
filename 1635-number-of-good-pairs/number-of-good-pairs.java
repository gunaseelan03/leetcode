class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num: nums){
            int isFoundCount=map.getOrDefault(num,0);
            count+=isFoundCount;
            map.put(num,isFoundCount+1);
        }
        return count;
    }
}