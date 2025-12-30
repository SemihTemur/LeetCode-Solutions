class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> result = new ArrayList<>();

        for (String s : s1.split(" ")) {
            map.merge(s, 1, Integer::sum);
        }

        for (String s : s2.split(" ")) {
            map.merge(s, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                result.add(entry.getKey());
        }

        return result.toArray(new String[0]);

    }
}