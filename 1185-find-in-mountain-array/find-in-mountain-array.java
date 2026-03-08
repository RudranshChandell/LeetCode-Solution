/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakIndex=findPeak(mountainArr);

        int result=findTarget(mountainArr,0,peakIndex,target,true);
        if(result!=-1) return result;

        return findTarget(mountainArr,peakIndex+1,mountainArr.length()-1,target,false);
    }

    public int findPeak(MountainArray mount){
        int low = 0, high = mount.length() - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (mount.get(mid) < mount.get(mid + 1)) {
                low = mid + 1; // We are in the ascending part
            } else {
                high = mid; // We are in the descending part or at the peak
            }
        }
        return low;
    }

    public int findTarget(MountainArray mount,int low,int high,int target,boolean which){
        if(which){
            while(low<=high){
                int mid=low+(high-low)/2;
                int num=mount.get(mid);
                if(num==target){
                    return mid;
                }else if (num<target) low=mid+1;
                else high=mid-1;
            }
        }else{
            while(low<=high){
                int mid=low+(high-low)/2;
                int num=mount.get(mid);
                if(num==target){
                    return mid;
                }else if (num<target)high=mid-1 ;
                else low=mid+1;
            }
        }
        return -1;
    }
}