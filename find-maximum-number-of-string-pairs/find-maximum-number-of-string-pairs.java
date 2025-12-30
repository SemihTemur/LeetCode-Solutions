class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int i = 0, j = 0, maximumNumberOfStringPairs = 0;

        for (i = 0; i < words.length; i++) {
            for (j = i + 1; j < words.length; j++) {
                StringBuilder sb = new StringBuilder();
                for (char c : words[j].toCharArray()) {
                    sb.append(c);
                }
                if (sb.reverse().toString().equals(words[i]))
                    maximumNumberOfStringPairs++;
            }
        }

        return maximumNumberOfStringPairs;
    }
}