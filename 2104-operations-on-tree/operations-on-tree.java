class LockingTree {
    private int[]parent;
    private int[]lockedby;
    private List<Integer>[]children;
    public LockingTree(int[] parent) {
        int n=parent.length;
        this.parent=parent;
        this.lockedby=new int[n];
        this.children=new List[n];

        Arrays.fill(this.lockedby,-1);

        Arrays.setAll(this.children,i-> new ArrayList<>());

        for(int i=1;i<n;i++){
            children[parent[i]].add(i);
        }
    }
    
    public boolean lock(int num, int user) {
        if(lockedby[num]!=-1){
            return false;
        }
        lockedby[num]=user;
        return true;
    }
    
    public boolean unlock(int num, int user) {
        if(lockedby[num]==user){
            lockedby[num]=-1;
            return true;
        }
        return false;
    }
    
    public boolean upgrade(int num, int user) {

        int currentnode=num;
        while(currentnode!=-1){
            if(lockedby[currentnode]!=-1){
                return false;
            }
            currentnode=parent[currentnode];
        }
        boolean []cond=new boolean[1];
        unlockDescendant(num,cond);

        if(!cond[0]){
            return false;
        }

        lockedby[num]=user;
        return true;
    }

    public void unlockDescendant(int node,boolean[]cond){

        for(int num:children[node]){
            if(lockedby[num]!=-1){
                lockedby[num]=-1;
                cond[0]=true;
            }
            unlockDescendant(num,cond);
        }
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */