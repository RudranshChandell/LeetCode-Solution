class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack<Character>stack=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='{' ||ch=='(' || ch=='['){
                stack.push(ch);
                continue;
            }else{
                if(stack.isEmpty()) return false;
                char check=stack.pop();
                if((ch=='}'&& check!='{')||(ch==']'&& check!='[')||(ch==')'&& check!='(')){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}