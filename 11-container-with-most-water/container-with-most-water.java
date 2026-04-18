class Solution {
    public int maxArea(int[] height) {
        int left=0,right=height.length-1;
        int area=0;

        while(left<right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;

            area=Math.max(area,(h*w));

            if(height[right]>height[left]) left++;
            else right--;
        }
        return area;
    }
}