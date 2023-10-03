class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int res = 0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
            if(entry.getValue()>1)
                res +=(entry.getValue()*(entry.getValue()-1))/2;
        return res;
    }
}