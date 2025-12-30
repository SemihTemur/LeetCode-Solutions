class Solution {
    public int scoreOfString(String s) {
        int i = 0, scoreOfString = 0;
        for (i = 0; i < s.length() - 1; i++) {
            scoreOfString = scoreOfString + Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return scoreOfString;
    }
}