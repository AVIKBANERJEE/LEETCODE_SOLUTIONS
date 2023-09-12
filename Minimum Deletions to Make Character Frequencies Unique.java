class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        char a[]=s.toCharArray();
        for(char ans:a){
            if(map.containsKey(ans)){
                map.put(ans,map.get(ans)+1);
            }
            else{
                map.put(ans,1);
            }
        }
        ArrayList<Integer>al=new ArrayList<>();
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            al.add(entry.getValue());
        }
        int a2[]=new int[al.size()];
        int c=0;
        for(int t:al){
            a2[c]=t;
            c++;
        }
        HashSet<Integer> hs=new HashSet<>();
        int del=0;
        for(int ans:a2){
            while(ans>0 && hs.contains(ans)){
                del++;
                ans--;
            }
            hs.add(ans);
        }
        return del;
        
    }
}
