class Solution {
    public char findTheDifference(String s, String t) {
        int res = 0;
        for(int i=0;i<s.length();i++)
            res+=t.charAt(i)-s.charAt(i);
        return (char)(res+t.charAt(t.length()-1));
    }
}