class Solution {
    public String freqAlphabets(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < s.length();) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                String value = "" + s.charAt(i) + s.charAt(i + 1);
                int number = 96 + Integer.parseInt(value);
                char c = (char) number;
                sb.append(c);
                i = i + 3;
            } else {
                String value = "" + s.charAt(i);
                int number = 96 + Integer.parseInt(value);
                char c = (char) number;
                sb.append(c);
                i++;
            }
        }
        return sb.toString();
    }
}