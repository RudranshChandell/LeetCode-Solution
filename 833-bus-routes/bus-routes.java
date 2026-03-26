class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source==target) return 0;
        Map<Integer,List<Integer>>stopToBus=new HashMap<>();

        for(int i=0;i<routes.length;i++){
            for(int stops:routes[i]){
                stopToBus.computeIfAbsent(stops,k->new ArrayList<>()).add(i);
            }
        }

        if (!stopToBus.containsKey(source) || !stopToBus.containsKey(target)) {
            return -1;
        }

        Set<Integer>visStop=new HashSet<>();
        Set<Integer>visBus=new HashSet<>();
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{source,0});
        visStop.add(source);

        while(!q.isEmpty()){
            int[]arr=q.poll();
            int currentStop=arr[0];
            int count=arr[1];

            if(currentStop==target){
                return count;
            }

            for(int bus:stopToBus.get(currentStop)){

                if(visBus.add(bus)){

                    for(int stop:routes[bus]){

                        if(visStop.add(stop)){
                            q.add(new int[]{stop,count+1});
                        }
                    }
                }
            }

        }
        return -1;
    }
}