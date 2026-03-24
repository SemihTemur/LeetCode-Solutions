class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String value = "balon";
        int count = Integer.MAX_VALUE;

        for (char c : text.toCharArray()) {
            if (value.indexOf(c) != -1)
                map.merge(c, 1, Integer::sum);
        }

        count = Math.min(count, map.getOrDefault('b', 0));
        count = Math.min(count, map.getOrDefault('a', 0));
        count = Math.min(count, map.getOrDefault('l', 0) / 2);
        count = Math.min(count, map.getOrDefault('o', 0) / 2);
        count = Math.min(count, map.getOrDefault('n', 0));
        
        return count;
    }
}