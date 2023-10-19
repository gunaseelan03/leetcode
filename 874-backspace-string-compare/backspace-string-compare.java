class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>s1=new Stack<>();
        Stack<Character>s2=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#'){
                if(!s1.isEmpty())
                    s1.pop();
                continue;
            }
            else
                s1.push(c);
        } 
        for(char c:t.toCharArray()){
            if(c=='#'){
                if(!s2.isEmpty())
                    s2.pop();
                continue;
            }
            else
                s2.push(c);
        }
        System.out.println(s1+" "+s2);
        while(!s1.isEmpty() && !s2.isEmpty()){
            if(s1.pop()!=s2.pop())
                return false;
        }
        if(s1.isEmpty() && s2.isEmpty())
            return true;
        return false;
    }
}