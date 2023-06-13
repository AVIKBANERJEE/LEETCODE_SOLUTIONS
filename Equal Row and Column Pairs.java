class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int c=0;
        for(int row=0;row<grid.length;row++){
            for(int col=0;col<n;col++){
                boolean temp=true;
                for(int i=0;i<n;i++){
                    if(grid[row][i]!=grid[i][col]){
                        temp=false;
                        break;
                    }
                }
                if(temp)
                    c++;
            }
        }
        return c;
    }
}
