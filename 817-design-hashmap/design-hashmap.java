class MyHashMap {
    List<int[]>lst;
    public MyHashMap() {
        lst = new ArrayList<>();
    }
    
    public void put(int key, int value) {
        boolean updated = false;
        for(int i=0;i<lst.size();i++){
            if(lst.get(i)[0]==key){
                lst.get(i)[1]=value;
                updated = true;
            }
        }
        if(!updated)
            lst.add(new int[]{key,value});
    }
    
    public int get(int key) {
        for(int i=0;i<lst.size();i++){
            
            if(lst.get(i)[0]==key)
                return lst.get(i)[1];
        }
        return -1;
    }
    
    public void remove(int key) {
        for(int i=0;i<lst.size();i++)
            if(lst.get(i)[0]==key)
                lst.remove(i);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */