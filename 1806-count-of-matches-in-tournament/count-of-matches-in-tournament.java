class Solution {
    public int numberOfMatches(int num) {
        int res = 0;
        while(num/2>0){
            res += (num/2);
            num = (num/2)+(num%2);
        }
        return res;
    }
}