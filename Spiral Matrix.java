class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> a=new ArrayList<>();
        int k=0,m=matrix.length,l=0,n=matrix[0].length;
        int i=0;
        while(k<m && l<n){
            //printing the first row
            for(i=l;i<n;i++){
                a.add(matrix[k][i]);
            }
            k++;
            //printing the last column
            for(i=k;i<m;i++){
                a.add(matrix[i][n-1]);
            }
            n--;
            //printing the last row
            if(k<m){
                for(i=n-1;i>=l;i--){
                    a.add(matrix[m-1][i]);
                }
            }
            m--;
            //printing the first column
            if(l<n){
                for(i=m-1;i>=k;i--){
                    a.add(matrix[i][l]);
                }
                l++;
            }
            
        }
        return a;
    }
}
