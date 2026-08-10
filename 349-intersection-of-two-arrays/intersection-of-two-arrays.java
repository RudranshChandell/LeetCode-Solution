class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0;
        int m=nums1.length,n=nums2.length;

        var list=new ArrayList<Integer>();
        while(i<m && j<n){
            if(nums1[i]==nums2[j]){
                if(list.size()==0 || list.get(list.size()-1)!=nums1[i]){
                    list.add(nums1[i]);
                }
                i++;
                j++;
            }else if (nums1[i]<nums2[j]) i++;
            else j++;
        }
        int[]ans=new int[list.size()];
        i=0;
        for(int k:list){
            ans[i++]=k;
        }
        return ans;
    }
}