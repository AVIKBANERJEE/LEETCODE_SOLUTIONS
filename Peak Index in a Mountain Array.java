class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if((arr[i]<arr[j]) && (arr[j]>arr[j+1])){
                     return j;
                }
                   
            }
        }
        return 1;
    }
}
