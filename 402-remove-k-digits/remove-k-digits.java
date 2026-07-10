class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>stack=new Stack<>();

        for(char ch:num.toCharArray()){
            while(true){
                if(k==0){
                    stack.push(ch);
                    break;
                }
                if(stack.isEmpty()){
                    stack.push(ch);
                    break;
                }
                char peek=stack.peek();

                if(peek<=ch){
                    stack.push(ch);
                    break;
                }else{
                    stack.pop();
                    k--;
                }
            }
        }

        while(k>0 && !stack.isEmpty()){
            stack.pop();
            k--;
        }

        int size=stack.size();
        System.out.println(size);
        
        char ch[]=new char[size];
        int i=size-1;

        while(i>=0){
            ch[i--]=stack.pop();
        }
        i=0;

        while(i<ch.length && ch[i]=='0'){i++;}

        StringBuilder str=new StringBuilder();

        while(i<ch.length){
            str.append(ch[i]);
            i++;
        }

        return str.length()==0?"0":str.toString();
    }
}