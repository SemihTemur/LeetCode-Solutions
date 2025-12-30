class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> maps = new HashMap<Character, Integer>();
        int length = 0;
        boolean add = false;
        for (char c : s.toCharArray()) {
            maps.merge(c, 1, Integer::sum);
        }

        for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
            int value = entry.getValue();
            length  = length + value /2 *2;
            if(value %2 ==1){
                add = true;
            }
        }

        if(add)
            length++;

        return length;
    }
}