class Solution {
    public int partitionString(String s) {
        HashSet<Character> hs=new HashSet<>();
        int c=0;
        for(int i=0;i<s.length();i++){
            if(!(hs.contains(s.charAt(i)))){
                hs.add(s.charAt(i));
            }
            else{
                c++;
                hs.clear();
                hs.add(s.charAt(i));
            }
        }
        if(!(hs.isEmpty()))
            c++;
        return c;
    }
}
