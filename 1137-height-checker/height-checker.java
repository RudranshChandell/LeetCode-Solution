class Solution {
    public int heightChecker(int[] heights) {
        int[]d=heights.clone();
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=d[i]) count++;
        }
        return count;
    }
}