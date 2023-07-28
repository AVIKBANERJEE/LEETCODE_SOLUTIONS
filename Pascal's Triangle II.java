class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al=new ArrayList<>();
        int c=0;
        for(int i=0;i<=rowIndex;i++){
            long number=1;
            if(c==(rowIndex)){
               for(int j=0;j<=i;j++){
                    al.add((int)number);
                   number=number*(i-j)/(j+1);
                }
            }
            else{
                c++;
            }
        }
        return al;
    }
}
