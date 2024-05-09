class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod=(int)1e9+7;
        int oddCount = 0, evenCount = 1; // Initialize evenCount as 1 to include the case when no elements are selected
        long result = 0, sum = 0;
        for (int num : arr) {
            sum += num;
            if (sum % 2 == 0) {
                result = (result + oddCount) % mod;
                evenCount++;
            } else {
                result = (result + evenCount) % mod;
                oddCount++;
            }
        }
        return (int) result;
    }
}
