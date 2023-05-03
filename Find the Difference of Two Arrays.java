class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        ArrayList<Integer> c=new ArrayList<>();
        HashSet<Integer> hs1=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int i:nums1){
            hs1.add(i);
        }
        for(int i:nums2)
            hs2.add(i);
        for(int a1:hs1){
            if(hs2.contains(a1)){
                hs2.remove(a1);
            }
            else
                b.add(a1);
        }
        for(int i:hs2)
            c.add(i);
        a.add(b);
        a.add(c);
        return a;
        
        
    }
}
