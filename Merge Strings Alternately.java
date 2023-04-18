class Solution {
    public String mergeAlternately(String word1, String word2) {
        char a[]=word1.toCharArray();
        char b[]=word2.toCharArray();
        StringBuilder sb=new StringBuilder();
        int l=word1.length();
        int m=word2.length();
        int c1=0,c2=0;
        for(int i=0;i<l || i<m;i++){
            if(i<l)
                sb.append(a[i]);
            if(i<m)
                sb.append(b[i]);
        }
      
        return sb.toString();
    }
}
