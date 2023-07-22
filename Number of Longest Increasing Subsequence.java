class Solution {
    public int findNumberOfLIS(int[] nums) {
        int res=0;
        if(nums.length==0)
            return 0;
        int n=nums.length;
        int[] length=new int[n];
        int[] count=new int[n];
        Arrays.fill(length,1); //it will set all the values of length[] to 1
        Arrays.fill(count,1);
        int maxlen=1;
        for(int i=1;i<n;i++){ //started with i=1 cause atleast 1 subsequence will be there
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(length[j]+1>length[i]){
                        length[i]=length[j]+1;
                        count[i]=count[j];
                    }
                    else if(length[j]+1 == length[i]){
                        count[i]+=count[j];
                    }
                }
            }
            maxlen=Math.max(maxlen,length[i]);
        }

        for(int i=0;i<n;i++){
            if(length[i]==maxlen){
                res+=count[i];
            }
        }
        return res;
       
    }
}
