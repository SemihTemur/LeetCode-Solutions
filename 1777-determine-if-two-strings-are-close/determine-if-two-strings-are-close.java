class Solution {
    public boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> word1Map = new HashMap<>();
        Map<Character, Integer> word2Map = new HashMap<>();

        int word1MaxCount = 0;
        int word2MaxCount = 0;

        for (char c : word1.toCharArray())
            word1Map.merge(c, 1, Integer::sum);

        for (char c : word2.toCharArray())
            word2Map.merge(c, 1, Integer::sum);

        for (char key : word1Map.keySet()) {
            if (!word2Map.containsKey(key))
                return false;
        }

         for (char key : word2Map.keySet()) {
            if (!word1Map.containsKey(key))
                return false;
        }

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (Integer value : word1Map.values()) {
            list1.add(value);
        }

        for (Integer value : word2Map.values()) {
            list2.add(value);
        }

        Collections.sort(list1);
        Collections.sort(list2);

        

        return list1.equals(list2);
    }
}