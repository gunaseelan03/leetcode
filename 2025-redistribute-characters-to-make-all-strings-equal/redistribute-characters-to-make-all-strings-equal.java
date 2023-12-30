class Solution {
    public boolean makeEqual(String[] words) {
        int count[] = new int[26];
        for(String s:words){
            for(char c : s.toCharArray())
                count[c-'a']++;
        }
        int n = words.length;
        for(int i:count)
            if(i!=0 && (i%n)!=0)
                return false;
        return true;
    }
}