class Solution {
    int[]parent;
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int len=s.length();
        this.parent=new int[len];

        List<Character>[]componentCharacter=new List[len];

        for(int i=0;i<len;i++){
            parent[i]=i;
            componentCharacter[i]=new ArrayList<>();
        }

        for(List<Integer>list:pairs){
            int firstParent=findParent(list.get(0));
            int secondParent=findParent(list.get(1));

            parent[firstParent]=secondParent;
        }

        char[]charArray=s.toCharArray();

        for(int i=0;i<len;i++){
            int root=findParent(i);
            componentCharacter[root].add(charArray[i]);
        }

        for(List<Character>component:componentCharacter){
           component.sort((a,b)->b-a); 
        }

        for(int i=0;i<len;i++){
            int root=findParent(i);
            char ch=componentCharacter[root].remove(componentCharacter[root].size()-1);

            charArray[i]=ch;
        }    

        return String.valueOf(charArray);
    }

    public int findParent(int x){
        if(parent[x]!=x){
            parent[x]=findParent(parent[x]);
        }
        return parent[x];
    }
}