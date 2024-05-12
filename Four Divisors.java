class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=isDivisor(nums[i]);
        }
        return ans;
    }
    public int isDivisor(int n){
        int sum=0;
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum+=i;
                c++;
            }
            if (c > 4) 
                return 0;
        }
        if(c==4)
            return sum;
        return 0;
    }
}
