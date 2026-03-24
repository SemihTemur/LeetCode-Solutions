class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String value = "balon";
        int count = Integer.MAX_VALUE;

        for (char c : text.toCharArray()) {
            if (value.indexOf(c) != -1)
                map.merge(c, 1, Integer::sum);
        }

        for (char c : value.toCharArray()) {
            if (map.containsKey(c) && c == 'b')
                count = Math.min(count, map.get(c));

            else if(map.containsKey(c) && c == 'l')
                count = Math.min(count,map.get(c) / 2);
            
            else if(map.containsKey(c) && c == 'a')
                count = Math.min(count,map.get(c));

            else if(map.containsKey(c) && c == 'n')
                count = Math.min(count,map.get(c));
            
            else if(map.containsKey(c) && c == 'o')
                count = Math.min(count,map.get(c) / 2);
            else
                return 0;
        }

        return count;
    }
}