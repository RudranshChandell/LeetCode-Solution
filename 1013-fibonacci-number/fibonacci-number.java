class Solution {
    public int fib(int n) {
        if(n==0 || n==1) return n;

        return calculate(0,1,2,n);
    }
    public int calculate(int a,int b,int step,int n){
        if(step==n){
            return a+b;
        }
        return calculate(b,a+b,step+1,n);
    }
}