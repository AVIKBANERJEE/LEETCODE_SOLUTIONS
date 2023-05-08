class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        //calculating the secondary diagonal
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];
        }
        int l=mat.length-1;
        for(int i=0;i<=l;i++){
            if(mat[i][i]==mat[i][l-i] &&(i==(l-i))){
                continue;
            }
            else
                sum+=mat[i][l-i];
        }
        return sum;
        
    }
}
