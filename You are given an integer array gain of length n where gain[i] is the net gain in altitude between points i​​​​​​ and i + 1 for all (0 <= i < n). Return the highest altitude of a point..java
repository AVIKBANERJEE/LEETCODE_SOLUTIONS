class Solution {
    public int largestAltitude(int[] gain) {
        int l=gain.length;
        int a[]=new int[l+1];
        a[0]=0;
        int c=0;
        for(int i=1;i<=l;i++){
            a[i]=a[i-1]+gain[c];
            c++;
        }
        Arrays.sort(a);
        return a[l];
        
    }
}
