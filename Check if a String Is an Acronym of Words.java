class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String res="";
        String w[]=new String[words.size()];
        int c=0;
        for(String i:words){
            w[c]=i;
            c++;
        }
        for(int i=0;i<words.size();i++){
            res=res+w[i].charAt(0);
        }
        if(res.equals(s))
            return true;
        return false;
    }
}
