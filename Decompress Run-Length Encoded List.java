class Solution {
    public int[] decompressRLElist(int[] nums) {
        int k=0;
        for(int i=0;i<nums.length;i+=2){
            k+=nums[i];
        }
        int a[]=new int[k];
        int c=0;
        for(int i=0;i<nums.length;i+=2){
            for(int j=0;j<nums[i];j++){
                a[c]=nums[i+1];
                c++;
            }

        }
        return a;
        
    }
}
