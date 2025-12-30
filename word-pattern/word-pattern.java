class Solution {
     public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false; // Uzunluklar eşleşmiyorsa direkt false
        }

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Eğer harf daha önce eşleştirilmişse ama kelime uyuşmuyorsa
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(c, word);
            }

            // Eğer kelime daha önce eşleştirilmişse ama harf uyuşmuyorsa
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) {
                    return false;
                }
            } else {
                wordToChar.put(word, c);
            }
        }

        return true;
    }
}