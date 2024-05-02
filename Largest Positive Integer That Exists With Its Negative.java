class Solution {
    public int findMaxK(int[] nums) {
        int ans=-1;
        ArrayList<Integer>al=new ArrayList<>();
        for(int i:nums){
            al.add(i);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(al.contains(-nums[i]) && (nums[i]>ans)){
                    ans=nums[i];
                }
            }
        }
        return ans;
        
    }
}
