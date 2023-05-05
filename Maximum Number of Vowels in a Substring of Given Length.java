class Solution {
    public int maxVowels(String s, int k) {
       int l=0,r=0,res=0,window=0;
        for(r=0;r<k;r++){
            window+=isVowel(s.charAt(r));
        }
        res=window;
        for(r=k;r<s.length();r++){
            window-=isVowel(s.charAt(r-k));//deleting the first char after every window
            window+=isVowel(s.charAt(r));// adding the next char after every window
            res=Math.max(res,window);
        }
        return res;
    }
    public int isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return 1;
        }
        else
            return 0;
    }
}
