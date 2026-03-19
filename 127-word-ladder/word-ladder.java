class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Node>q=new  LinkedList<>();
        q.add(new Node(beginWord,1));
        
        HashSet<String>set=new HashSet<>(wordList);
        set.add(beginWord);
        
        while(!q.isEmpty()){
            String word=q.peek().word;
            int count=q.peek().count;
            q.poll();

            if(word.equals(endWord)){
                return count;
            }

            for(int i=0;i<word.length();i++){
                
                char []str=word.toCharArray();
                
                for(char ch='a';ch<='z';ch++){
                    str[i]=ch;
                    String newword=new String(str);
                    if(set.contains(newword)){
                        set.remove(newword);
                        q.add(new Node (newword,count+1));
                    }
                }
            }
        }
        return 0;   
    }
}
public class Node{
    String word;
    int count;

    public Node(String word,int count){
        this.word=word;
        this.count=count;
    }
}