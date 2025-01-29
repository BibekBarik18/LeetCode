class MapSum {
HashMap<String,Integer> map=new HashMap<>();
    public MapSum() {
        
    }
    
    public void insert(String key, int val) {
        this.map.put(key,val);
    }
    
    public int sum(String prefix) {
        int sum=0;
        Set entries=map.entrySet();
		Iterator itr=entries.iterator();
        while(itr.hasNext())
        {
            Map.Entry a=(Map.Entry)itr.next();
            if(((String)a.getKey()).startsWith(prefix))
            {
                sum=sum+(Integer)a.getValue();
            }
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
