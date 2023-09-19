class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer>hs=new HashSet<>();
        for(int ans:nums){
            hs.add(ans);
        }
        int ans=1;
        while(hs.contains(ans)){
            ans++;
        }
        return ans;
    }
}
