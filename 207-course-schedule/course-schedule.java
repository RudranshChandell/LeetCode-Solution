class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[]inorder=new int[numCourses];
        List<List<Integer>>adj=new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int arr[]:prerequisites){
            adj.get(arr[1]).add(arr[0]);
            inorder[arr[0]]++;
        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inorder[i]==0){
                q.add(i);
            }
        }

        int count=0;
        while(!q.isEmpty()){
            int num=q.poll();
            count++;

            for(int i:adj.get(num)){
                inorder[i]--;
                if(inorder[i]==0){
                    q.add(i);
                }
            }
        }
        return count==numCourses;
    }
}