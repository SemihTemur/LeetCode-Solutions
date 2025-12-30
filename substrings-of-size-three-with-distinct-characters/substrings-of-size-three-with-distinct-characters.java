class Solution {
    public int countGoodSubstrings(String s) {
        int countGoodSubstrings = 0, i = 0;

        for (i = 0; i < s.length() - 2; i++) {
            boolean isCountGoodSubstrings = true;
            String subString = s.substring(i, i + 3);
            Set<Character> set = new HashSet<Character>();
            for (char c : subString.toCharArray()) {
                if (!set.add(c))
                    isCountGoodSubstrings = false;
            }
            if (isCountGoodSubstrings) {
                countGoodSubstrings++;
            }
        }

        return countGoodSubstrings;
    }
}