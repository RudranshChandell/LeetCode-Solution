class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int i: nums){
            list.add(i);
        }
        

        int operation=0;

        while(!isSorted(list)){
            int sum=Integer.MAX_VALUE;
            int minIndex=-1;

            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)+list.get(i+1)<sum){
                    sum=list.get(i)+list.get(i+1);
                    minIndex=i;
                }
            }
            list.set(minIndex,sum);
            list.remove(minIndex+1);
            operation++;
        }
        return operation;

    }

    public static boolean isSorted(List<Integer>list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)> list.get(i+1)){
                return false;
            }
        }
        return true;
    }

}