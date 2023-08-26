class Solution {
    public String sortVowels(String s) {
        char a[]=s.toCharArray();
        ArrayList<Character>al=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if((a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')|| (a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U'))
                al.add(a[i]);
        }
        Collections.sort(al);
        int c=0;
        for(int i=0;i<s.length();i++){
            if((a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')|| (a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U')){
                a[i]=al.get(c);
                c++;
            }
               
        }
        String res=String.valueOf(a);
        return res;
    }
}
