class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans=new int[2];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int c=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                ans[c]=entry.getKey();
                c++;
            }
        }
        return ans;
    }
}
