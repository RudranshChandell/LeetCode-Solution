class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[]inorder=new int[numCourses];
        List<List<Integer>>list=new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }

        for(int []arr:prerequisites){
            list.get(arr[1]).add(arr[0]);
            inorder[arr[0]]++;
        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inorder[i]==0){
                q.add(i);
            }
        }
        int j=0,count=0;
        int[]ans=new int[numCourses];

        while(!q.isEmpty()){
            int num=q.poll();
            ans[j++]=num;
            count++;

            for(int i:list.get(num)){
                inorder[i]--;
                if(inorder[i]==0){
                    q.add(i);
                }
            }
        }

        return count==numCourses?ans:new int[0];
    }
}