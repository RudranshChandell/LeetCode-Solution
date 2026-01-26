class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>list=new ArrayList<>();
        Arrays.sort(arr);
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            if(diff==small){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
            if(diff<small){
                list.clear();
                small=arr[i+1]-arr[i];
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }

        return list;
    }
}