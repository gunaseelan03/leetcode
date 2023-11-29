public class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        boolean neg = false;
        if(n<0){
            n=~n;
            neg = true;
        }
        while(n>0){
            if((n&1)==1)
                res++;
            n=n>>1;
        }
        return neg==true?32-res:res;
    }
}