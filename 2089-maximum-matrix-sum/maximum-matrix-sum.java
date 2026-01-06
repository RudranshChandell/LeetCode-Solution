class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum=0;

        int negativeCount=0;

        int minabsVal=Integer.MAX_VALUE;

        for(int []arr:matrix){

            for(int num: arr){
                if(num<0){
                    negativeCount++;
                }

                int absVal=Math.abs(num);

                minabsVal=Math.min(absVal,minabsVal);

                totalSum+=absVal;
            }
        }

        if(negativeCount % 2==0){
            return totalSum;
        }
        return totalSum- (2*minabsVal);
        
    }
}