class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int dis[] = new int[garbage.length];
        dis[0] = 0;
        for(int i=1;i<=travel.length;i++)
            dis[i] = dis[i-1]+travel[i-1];
        int lastP=0,lastM=0,lastG=0,res=0;
        for(int i=0;i<garbage.length;i++){
            for(char c : garbage[i].toCharArray()){
                res++;
                if(c=='M')
                    lastM=i;
                if(c=='P')
                    lastP=i;
                if(c=='G')
                    lastG=i;
            }
        }
        res += dis[lastM]+dis[lastP]+dis[lastG];
        return res;
    }
}