class Solution {
    public boolean areNumbersAscending(String s) {
        String[] tokens = s.split(" ");
        int prevNum = -1;
        for (String token : tokens) {
            if (Character.isDigit(token.charAt(0))) {
                int num = Integer.parseInt(token);
                if (num <= prevNum) {
                    return false;
                }
                prevNum = num;
            }
        }
        return true;
    }
}
