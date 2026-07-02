class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stack=new Stack<>();
        int[]ans=new int[temperatures.length];
        stack.push(0);
        for(int i=1;i<temperatures.length;i++){
            int count=0;
            while(!stack.isEmpty() && temperatures[stack.peek()]<temperatures[i]){
                count++;
                ans[stack.peek()]=i-stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}