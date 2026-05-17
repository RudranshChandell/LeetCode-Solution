class Solution {
    public boolean canReach(int[] arr, int start) {
        int n=arr.length;
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        int[]vis=new int[n];
        vis[start]=1;
        while(!q.isEmpty()){
            int curr=q.poll();
            if(arr[curr]==0) return true;

            if(curr+arr[curr]>=0 && curr+arr[curr]<n && vis[curr+arr[curr]]==0){
                q.add(curr+arr[curr]);
                vis[curr+arr[curr]]=1;
            }
            if(curr-arr[curr]>=0 && curr-arr[curr]<n && vis[curr-arr[curr]]==0){
                q.add(curr-arr[curr]);
                vis[curr-arr[curr]]=1;
            }
        }
        return false;
    }
}