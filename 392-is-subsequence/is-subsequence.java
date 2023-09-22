class Solution {
    static boolean is_valid(String s,String t,int n,int m){
        if(n==0)
            return true;
        if(m==0)
            return false;
        if(s.charAt(n-1)==t.charAt(m-1))
            return is_valid(s,t,n-1,m-1);
        return is_valid(s,t,n,m-1);
    }
    public boolean isSubsequence(String s, String t) {
        return is_valid(s,t,s.length(),t.length());
    }
}