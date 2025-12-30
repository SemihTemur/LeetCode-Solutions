class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> maps = new HashMap<>();
        String vowels = "aeiou";
        int maxVowelsValue = 0, maxConsonantValue = 0;

        for (Character c : s.toCharArray()) {
            maps.merge(c, 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
            if (vowels.indexOf(entry.getKey()) != -1) {
                if (entry.getValue() > maxVowelsValue)
                    maxVowelsValue = entry.getValue();
            } else {
                if (entry.getValue() > maxConsonantValue)
                    maxConsonantValue = entry.getValue();
            }
        }

        return maxVowelsValue + maxConsonantValue;
    }
}