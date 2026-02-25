class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }

        int []res=new int[queries.length];

        for(int i=0;i<queries.length;i++){
            res[i]=binarySearch(nums,queries[i]);
        }

        return res;
    }

    public int binarySearch(int[]nums,int target){
        int low=0,high=nums.length-1;
        int ans=0;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]<=target){
                ans=mid+1;

                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        return ans;
    }
}