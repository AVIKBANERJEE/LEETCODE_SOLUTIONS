class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)
            return 1;
        int result = 10; // For n = 1, there are 10 numbers (0-9)
        int uniqueDigits = 9;
        int availableNumber = 9;
        
        while (n > 1 && availableNumber > 0) {
            uniqueDigits = uniqueDigits * availableNumber;
            result += uniqueDigits;
            availableNumber--;
            n--;
        }
        
        return result;
    }
    
}
