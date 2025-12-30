class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> splitWordsBySeparator = new ArrayList<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                if (c != separator) {
                    sb.append(c);
                } else if (sb != null && sb.length() > 0) {
                    splitWordsBySeparator.add(sb.toString());
                    sb.setLength(0);
                }
            }
            if(sb != null && sb.length() > 0)
                splitWordsBySeparator.add(sb.toString());
        }

        return splitWordsBySeparator;
    }
}