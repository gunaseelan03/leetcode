class Solution {
    public String reverseWords(String s) {
        String ss[] = s.split(" ");
        String res = "";
        for(String str:ss){
            StringBuilder sb = new StringBuilder(str);
            res+=sb.reverse().toString()+" ";
        }
        return res.trim();
    }
}