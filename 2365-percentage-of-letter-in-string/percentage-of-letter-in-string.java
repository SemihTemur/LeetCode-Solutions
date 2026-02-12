class Solution {
    public int percentageLetter(String s, char letter) {
        double count = 0;
        double length = s.length();

        for (char c : s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }

        double value = (count / length) * 100 ;

        return (int) value;
    }
}