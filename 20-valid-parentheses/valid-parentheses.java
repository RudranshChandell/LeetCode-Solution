class Solution {
    public boolean isValid(String s) {
        if(s.length()==1)return false;
        Stack<Character>stack=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch==')' || ch=='}' || ch==']'){
                if(stack.isEmpty() || ch!=stack.pop()) return false;
            }
            else{
                stack.push(ch=='('?')':ch=='['?']':'}');
            }
        }
        return stack.isEmpty();


    }
}