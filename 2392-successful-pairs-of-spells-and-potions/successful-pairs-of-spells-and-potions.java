class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int []res=new int[spells.length];
        int k=0;

        for(int i:spells){
            int count=binarySearch(i,potions,success);
            res[k++]=count;
        }

        return res;
    }

    public int binarySearch(int x,int[]nums,long success){
        int low=0,high=nums.length-1;
        int firstValid=nums.length;
        while(low<=high){
            int mid=(high-low)/2+low;

            long prod=(long)nums[mid]*x;

            if(prod>=success){
                firstValid=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return nums.length-firstValid;
    }
}