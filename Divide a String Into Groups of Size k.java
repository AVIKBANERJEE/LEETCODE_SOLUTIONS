class Solution {
    public String[] divideString(String s, int k, char fill) {
        ArrayList<String> temp=new ArrayList<>();
        for(int i=0;i<s.length();i=i+k){
            String s2="";
            for(int j=i;j<i+k;j++){
                if (j < s.length()) {
                    s2 = s2 + s.charAt(j);
                } else {
                    s2 = s2 + fill;
                } 
            }
            
            temp.add(s2);
        }
        int c=0;
        String res[]=new String[temp.size()];
        for(String a:temp){
            res[c]=a;
            c++;
        }
        return res;
    }
}
