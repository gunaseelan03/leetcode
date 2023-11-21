class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        List<Integer>lst = new ArrayList<>();
				for(int i:asteroids)
					lst.add(i);
        for(int i=lst.size()-2;i>=0;i--){
		    while(i+1<lst.size() && lst.get(i)>0 && lst.get(i+1)<0){
		        if(i+1<lst.size() && Math.abs(lst.get(i+1))<lst.get(i)){
		            lst.remove(i+1);
		        }
						else if(i+1<lst.size() && Math.abs(lst.get(i+1))==lst.get(i)){
							lst.remove(i);
							lst.remove(i);
						}
						else{
		            lst.remove(i);
		        }
		    }
		}
		int idx = 0;
		int res[] = new int[lst.size()];
    for(int i=0;i<lst.size();i++)
			res[idx++]=lst.get(i);
		return res;
    }
}