class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int i;
        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1)
                return i;
        }

        return -1;

    }
}