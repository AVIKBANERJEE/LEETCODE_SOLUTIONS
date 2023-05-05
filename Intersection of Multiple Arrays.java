class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> a=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(map.containsKey(nums[i][j])){
                    map.put(nums[i][j],map.get(nums[i][j])+1);
                }
                else{
                    map.put(nums[i][j],1);
                }
            }
        }
        int n=nums.length;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==n){
                a.add(entry.getKey());
            }
        }
        Collections.sort(a);
        return a;
        
        
        
    }
}
