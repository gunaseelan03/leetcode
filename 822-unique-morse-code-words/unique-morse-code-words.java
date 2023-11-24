class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morse[] = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String>set=new HashSet<>();
        for(String s : words){
            String morseCode = "";
            for(char c : s.toCharArray()){
                morseCode+=morse[c-'a'];
            }
            set.add(morseCode);
        }
        return set.size();
    }
}