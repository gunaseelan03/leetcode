class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int res =-1;
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            Integer c = map.get(s.charAt(i));
            if(c==null)map.put(s.charAt(i),i);
            else res = Math.max(res,i-c-1);
        }
        return res;
    }
}