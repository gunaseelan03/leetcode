class Solution {
    public boolean winnerOfGame(String colors) {
        int a=0,b=0;
        for(int i=0;i<=colors.length()-3;i++){
            String str = colors.substring(i,i+3);
            //System.out.println(str);
            if(str.equals("AAA"))
                a++;
            else if(str.equals("BBB"))
                b++;
        }
        //System.out.println(a+" "+b);
        return a>b;
    }
}