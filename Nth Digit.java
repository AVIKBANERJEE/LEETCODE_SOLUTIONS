class Solution {
    public int findNthDigit(int n) {
        int length = 1; // Initial digit length (1 for 1-9)
        long count = 9; // Number of integers contributing to current digit length (9 for 1-9)
        int start = 1; // Starting number of the current digit length (1 for 1-9)

        // Identify the range that contains the nth digit
        while (n > length * count) {
            n -= length * count;
            length++;
            count *= 10;
            start *= 10;
        }

        // Find the exact number containing the nth digit
        start += (n - 1) / length;
        String s = Integer.toString(start);

        // Find the exact digit within that number
        return Character.getNumericValue(s.charAt((n - 1) % length));
        
    }
}
