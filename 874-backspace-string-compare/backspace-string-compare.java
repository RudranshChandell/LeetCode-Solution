class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>stack=new Stack<>();
        Stack<Character>stack2=new Stack<>();

        doit(stack,s);
        doit(stack2,t);
        return stack2.equals(stack);
    }
    public static void doit(Stack<Character> stack,String s){
        for(char ch:s.toCharArray()){
            if(ch=='#'&& !stack.isEmpty()) {

                stack.pop();
                continue;
            }
            if(ch!='#')
            stack.push(ch);
        }
    }
}