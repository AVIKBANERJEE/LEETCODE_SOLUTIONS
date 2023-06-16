class Solution {
    public int minimizedStringLength(String s) {
        LinkedHashSet<Character> hs=new LinkedHashSet<>();
        char a1[]=s.toCharArray();
        for(char t:a1){
            hs.add(t);
        }
        return hs.size();
    }
}
