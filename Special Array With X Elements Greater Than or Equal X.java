class Solution {
    public int specialArray(int[] nums) {
        int ans=nums.length;
        for(int i=0;i<nums.length;i++){
            int c=0;
            int x=i+1;
            for(int j=0;j<nums.length;j++){
                if(x<=nums[j])
                    c++;
            }
            if(c==x)
                return x;
        }
        return -1;
        
        
    }
}
