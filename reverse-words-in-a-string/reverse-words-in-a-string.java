class Solution {
    public String reverseWords(String s) {
        String[] word = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        int i = 0;

        for (i = word.length - 1; i >= 0; i--) {
             sb.append(word[i] + " ");
        }

        return sb.toString().trim();
    }
}