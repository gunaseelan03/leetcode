class Solution {
    public boolean isAnagram(String s, String t) {
        int ht[] = new int[26];
        for(int i =0; i<s.length(); i++){
            ht[s.charAt(i)-97]++;
        }
        for(int j=0; j<t.length(); j++){
            ht[t.charAt(j)-97]--;
        }
        for(int i=0; i<26; i++){
            if(ht[i]!=0)return false;
        }
        return true;

    }
}