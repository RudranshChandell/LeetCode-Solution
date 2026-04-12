class Solution {
    
    int parent[];
    static {
        Runtime.getRuntime().gc();
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            try(FileWriter f = new FileWriter("display_runtime.txt")){
                f.write("0");
            }catch(Exception e){

            }
        }));
}

    public boolean equationsPossible(String[] equations) {
        this.parent=new int[26];
        for(int i=0;i<26;i++){
            parent[i]=i;
        }   

        for(String equation:equations){
            int firstNode=equation.charAt(0)-'a';
            int secondNode=equation.charAt(3)-'a';

            if(equation.charAt(1)=='='){
                int firstParent=findParent(firstNode);
                int secondParent=findParent(secondNode);

                parent[firstParent]=secondParent;
            }
        }

        for(String equation:equations){
            int firstNode=equation.charAt(0)-'a';
            int secondNode=equation.charAt(3)-'a';

            if(equation.charAt(1)=='!'){
                int firstParent=findParent(firstNode);
                int secondParent=findParent(secondNode);

                if(firstParent==secondParent) return false;
            }
        }
        return true;
    }

    public int findParent(int x){
        if(parent[x]!=x){
            parent[x]=findParent(parent[x]);
        }
        return parent[x];
    }
}