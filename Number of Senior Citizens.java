class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++){
            String s=details[i];
            char s1=s.charAt(11);
            char s2=s.charAt(12);
            String res1=String.valueOf(s1);
            String res2=String.valueOf(s2);
            String res=res1+res2;
            int num=Integer.parseInt(res);
            if(num>60)
                c++;
        }
        return c;
    }
}
