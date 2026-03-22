class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        if(check(mat,target)) return true;
        for(int i=0;i<3;i++){
            turnLeft(mat);
            if(check(mat,target)) return true;
        }
        return false;
    }

    public void turnLeft(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int[] a : arr) {
            for (int i = 0; i < a.length / 2; i++) {
                int temp = a[i];
                a[i] = a[a.length - 1 - i];
                a[a.length - 1 - i] = temp;
            }
        }
    }

    public boolean check(int[][]mat,int [][]target){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]!=target[i][j]) return false;
            }
        }
        return true;
    }
}