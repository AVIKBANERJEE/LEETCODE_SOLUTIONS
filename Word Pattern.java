class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;
        }
        
        Map<Character, String> patternMap = new HashMap<>();
        Map<String, Character> wordMap = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            
            if (patternMap.containsKey(c)) {
                if (!patternMap.get(c).equals(word)) {
                    return false; // Mismatch in pattern
                }
            } else {
                patternMap.put(c, word);
            }
            
            if (wordMap.containsKey(word)) {
                if (wordMap.get(word) != c) {
                    return false; // Mismatch in word
                }
            } else {
                wordMap.put(word, c);
            }
        }
        
        return true;
    }
}
