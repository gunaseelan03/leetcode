class Solution {
    public int minDeletions(String s) {
        int freq[] = new int[26],res=0;
        for(char c:s.toCharArray())
            freq[c-'a']++;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<26;i++){
            while(freq[i]>0 && set.contains(freq[i])){
                res++;
                freq[i]--;
            }
            set.add(freq[i]);
        }
        return res;
    }
}