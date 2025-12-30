class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();

        for(char c:s.toCharArray()){
            map.merge(c,1,Integer::sum);
        }

        int value = map.get(s.charAt(0));

        for(char c:s.toCharArray()){
            if(value!=map.get(c))
                return false;
        }

        return true;

    }
}