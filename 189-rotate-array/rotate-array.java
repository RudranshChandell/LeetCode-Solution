class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;

        k=k%length;

        int[]arr=new int[length];

        for(int i=0;i<length;i++){
            arr[(i+k)%length]=nums[i];
        }
        for(int i=0;i<length;i++){
            nums[i]=arr[i];
        }
    }
}