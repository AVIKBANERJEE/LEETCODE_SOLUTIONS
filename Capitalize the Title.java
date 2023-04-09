class Solution {
    public String capitalizeTitle(String title) {
        String a[]=title.split(" ");
        for(int i=0;i<a.length;i++){
            String s=a[i];
            if(s.length()==1 || s.length()==2)
                a[i]=s.toLowerCase();
            else
                a[i]=Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
                
        }
        String ans = String.join(" ", a);
        return ans;
        
    }
}
