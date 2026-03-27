class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String>set=new HashSet<>(Arrays.asList(bank));

        Queue<Node>q=new LinkedList<>();
        q.add(new Node(startGene,0));

        char[]arr={'A','C','G','T'};

        while(!q.isEmpty()){
            String gene=q.peek().word;
            int count=q.peek().count;
            q.poll();

            if(gene.equals(endGene)){
                return count;
            }

            for(int i=0;i<gene.length();i++){
                for(char j:arr){
                    char[] newWord=gene.toCharArray();
                    newWord[i]=j;
                    String nextWord=new String(newWord);
                    if(set.contains(nextWord)){

                        q.add(new Node(nextWord, count+1));
                        set.remove(nextWord);
                        if(nextWord.equals(endGene)){
                            return count+1;
                        }
                    }
                }
            }

            
        }
        return -1;
    }
}
class Node{
    String word;
    int count;

    public Node(String word,int count){
        this.word=word;
        this.count=count;
    }
}