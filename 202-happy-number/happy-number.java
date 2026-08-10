class Solution {
    public boolean isHappy(int n) {
        int slow =n,fast=n;

        do{
            slow=calculate(slow);
            fast=calculate(calculate(fast));
        }while(slow!=fast);
        return slow==1;
    }
    public int calculate(int n){
        int ans=0;
        while(n>0){
            int digit=n%10;
            ans=ans+digit*digit;
            n/=10;
        }
        return ans;
    }
}