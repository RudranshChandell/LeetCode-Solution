class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        for(int []arr:matrix){
            int i=0,j=n-1;
            while(i<=j){
                int mid=((j-i)/2)+i;
                if(arr[mid]==target){
                    return true;
                }else if(arr[mid]>target){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }
        }
        return false;
    }
}