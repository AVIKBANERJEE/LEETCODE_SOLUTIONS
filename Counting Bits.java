class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        int c1=0;
        for(int i=0;i<=n;i++){
            int c=0;
            String s=Integer.toBinaryString(i);
            char a[]=s.toCharArray();
            for(char t:a){
                if(t=='1')
                    c++;
            }
            ans[c1]=c;
            c1++;
        }
        return ans;
    }
}
