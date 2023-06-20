class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int a[]=new int[n];
        long pre[]=new long[n];
        long suff[]=new long[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        suff[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]+nums[i];
        }
        
        for(int i=0;i<n;i++){
            if((i-k)<0 || (i+k)>=n)
                a[i]=-1;
            else{
                long sum=(long)((suff[i-k]-suff[i]) + (pre[i+k]-pre[i]) + nums[i]);
                sum=sum/(2*k+1);
                a[i]=(int)sum;
            }
        }
        return a;
        
        
    }
}
