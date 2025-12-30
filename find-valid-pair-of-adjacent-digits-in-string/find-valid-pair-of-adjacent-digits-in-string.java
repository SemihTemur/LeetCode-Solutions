class Solution {
    public String findValidPair(String s) {
        Map<Character, Integer> maps = new HashMap<Character, Integer>();
        int i = 0;
        for (char c : s.toCharArray())
            maps.merge(c, 1, Integer::sum);

        for (i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i), b = s.charAt(i + 1);
            if (a != b && maps.get(a) == a - '0' && maps.get(b) == b - '0') {
                return "" + a + b;
            }
        }

        return "";

    }
}