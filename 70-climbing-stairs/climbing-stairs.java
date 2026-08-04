class Solution {
    public int climbStairs(int n) {
        HashMap<Integer,Integer>memo=new HashMap<>();
        return memorization(n,memo);
    }
    public static int memorization(int n,HashMap<Integer,Integer>memo){
        if(n==1 || n==0) return 1;

        if(!memo.containsKey(n)){
            memo.put(n,memorization(n-1,memo)+memorization(n-2,memo));
        }
        return memo.get(n);
    }
}