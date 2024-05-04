class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            al.add(entry.getValue());
        }
        for(int i=0;i<al.size();i++){
            int temp=al.get(i);
            for(int j=i+1;j<al.size();j++){
                if(temp==al.get(j))
                    return false;
            }
        }
        return true;
    }
}
