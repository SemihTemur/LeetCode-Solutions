class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String letter = licensePlate.replaceAll("[^a-zA-Z]", "");
        String shortestCompletingWord = "";
        Map<Character, Integer> letterMap = new HashMap<Character, Integer>();
        int size = 999999;

        for (char c : letter.toCharArray()) {
            letterMap.merge(Character.toUpperCase(c), 1, Integer::sum);
        }

        for (String word : words) {
            Map<Character, Integer> wordMap = new HashMap<Character, Integer>();
            boolean isEnter = false;
            for (char c : word.toCharArray()) {
                wordMap.merge(Character.toUpperCase(c), 1, Integer::sum);
            }
            for (char c : letter.toUpperCase().toCharArray()) {
                if (!wordMap.containsKey(c) || wordMap.get(c) < letterMap.get(c)) {
                    isEnter = true;
                    break;
                }
            }
            if (!isEnter && word.length() < size) {
                size = word.length();
                shortestCompletingWord = word;
            }
        }

        return shortestCompletingWord;

    }
}