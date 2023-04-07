class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int c=0;
        int max=0,i=0;
        while(i<s.length()){
            if(!(hs.contains(s.charAt(i)))){
                hs.add(s.charAt(i));
                max=Math.max(hs.size(),max);
                i++;
                
            }
            else{ 
                hs.remove(s.charAt(c));
                c++;
            }
                
        }
        return max;
    }
}
