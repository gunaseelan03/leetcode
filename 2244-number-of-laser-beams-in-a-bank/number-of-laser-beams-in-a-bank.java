class Solution {
    public int numberOfBeams(String[] bank) {
        int prev = 0, count = 0, res = 0;
        for(String s:bank){
            for(char c:s.toCharArray())
                if(c=='1')
                    count++;
            if(count!=0){
                res+=(count*prev);
                prev = count;
                count=0;
            }
        }
        return res;
    }
}