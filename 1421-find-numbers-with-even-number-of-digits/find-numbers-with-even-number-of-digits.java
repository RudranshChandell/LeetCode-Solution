class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums ){
            if (check(i))count++;
        }
        return count;
    }
    public boolean check(int num){
        int size=0;

        while(num>0){
            size++;
            num/=10;
        }
        return size%2==0;
    }
}