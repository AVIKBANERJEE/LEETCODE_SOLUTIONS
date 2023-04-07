class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int a[]=new int[queries.length];
        int[] str=new int[words.length];
        for(int i=0;i<words.length;i++){
            str[i]=isvowel(words[i]);
        }
        for(int i=0;i<queries.length;i++){
            int c=0;
            int l=queries[i][0];
            int r=queries[i][1];
            for(int k=l;k<=r;k++){
                c+=str[k];
            }
            a[i]=c;
        }
        return a;
        
        
    }
    //find the no of words startinng with vowels and storing in another array
    public int isvowel(String s){
        int l=s.length();
        char c1=s.charAt(0);
        char c2=s.charAt(l-1);
        if((c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u') && (c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u'))
               return 1;
        return 0;
        
    }
}
