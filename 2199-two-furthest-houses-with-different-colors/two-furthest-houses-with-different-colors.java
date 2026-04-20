class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        if(n<=1) return 0;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(colors[i]!=colors[j]) max=Math.max(max,Math.abs(j-i));
            }
        }
        return max;
    }
}