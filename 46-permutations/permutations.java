class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList<>();
        while(true){
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);
            }
            list.add(temp);
            int pivot=-1;
            for(int right=n-2;right>=0;right--){
                if(nums[right]<nums[right+1]) {
                    pivot=right;
                    break;
                }
            }    

            if(pivot==-1) return list;

            for(int right=n-1;right>=0;right--){
                if(nums[right]>nums[pivot]){
                    swap(nums,pivot,right);
                    reverse(nums,pivot+1,n-1);
                    break;
                }
            }       
        }
    }
    public void swap(int []nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
    public void reverse(int []nums,int start,int end){
        while(start<=end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
}