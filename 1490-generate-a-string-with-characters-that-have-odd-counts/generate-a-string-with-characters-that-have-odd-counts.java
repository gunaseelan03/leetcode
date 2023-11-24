class Solution {
    public String generateTheString(int n) {
        if(n%2==0)
            return "g".repeat(n-1)+"s";
        return "g".repeat(n);
    }
}