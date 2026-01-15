class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largest=0;
        for(int i:candies){
            largest=Math.max(largest,i);
        }
        List<Boolean>arr=new ArrayList<>();

        for(int i=0;i<candies.length;i++){
            arr.add((candies[i]+extraCandies)>=largest);
        }
        return arr;
    }
}