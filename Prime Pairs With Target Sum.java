class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> al=new ArrayList<>();
        boolean a[]=new boolean[n+1];
        Arrays.fill(a,true);
        for(int i=2;i*i<=n;i++){
            if(a[i]==true){
                for(int j=i*i;j<=n;j=j+i){
                    a[j]=false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (i + i > n) 
                break;
            if ((a[i] && a[n - i])) {
                al.add(Arrays.asList(i, n - i));
            }
        }
        return al;
    }
}
