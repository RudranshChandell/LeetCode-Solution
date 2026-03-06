/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mount) {
        int length=mount.length();

        int peakIndex=findPeak(mount,length);
        
        int result=find(mount,0,peakIndex,target,true);

        if(result!=-1){
            return result;
        }

        return find(mount,peakIndex+1,length-1,target,false);
    }

    public int find(MountainArray mount,int low,int high,int target,boolean isUpside){
        
        while(low<=high){
            int mid=low+(high-low)/2;
            int midVal=mount.get(mid);
            if(mount.get(mid)==target){
                return mid;
            }
            if(isUpside){
                if (target > midVal) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else {
                if (target > midVal) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        
        return -1;
    }
    public int findPeak(MountainArray mount,int length){
        int low=0,high=length-1;
        int peak=Integer.MIN_VALUE;
        int peakIndex=0;
        while(low<high){
            int mid=low+(high-low)/2;

            if (mount.get(mid) < mount.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
                        
        }
        return low;
    }
}