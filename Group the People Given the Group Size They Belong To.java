class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> al=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            //for handling 0 value
            if(groupSizes[i]>0){
                 int size=groupSizes[i];
                 List<Integer> al2=new ArrayList<>();
                 for(int j=0;j<groupSizes.length && al2.size()<size;j++){
                    if(groupSizes[j]==size){
                        al2.add(j);
                        groupSizes[j]=0;
                    }
                }
                //as we dont want to add empty list into the 2d list
                if(al2.size()>0){
                    al.add(al2);
                }
            }
            else{
                continue;
            }
        }
        return al;
    }
}
