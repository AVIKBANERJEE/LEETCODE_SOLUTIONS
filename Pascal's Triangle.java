class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>al=new ArrayList<>();
        for(int i=0;i<numRows;i++){
            ArrayList<Integer>al2=new ArrayList<>();
            int number=1;
            for(int j=0;j<=i;j++){
                al2.add(number);
                number=number*(i-j)/(j+1);
            }
            al.add(al2);
        }
        return al;
    }
}
