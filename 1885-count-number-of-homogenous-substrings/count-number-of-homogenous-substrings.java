class Solution {
    public int countHomogenous(String s) {
        int count = 1;
        int res=1;
        int mod=(int)1e9+7;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1))
                count++;
            else
                count = 1;
            res = (res+count)%mod;
        }
        return res;
    }
}