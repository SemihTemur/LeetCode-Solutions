class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> list = new ArrayList<>();
        int i = 0;

        for (i = 0; i < s.length(); i = i + k) {
            if (i + k < s.length()) {
                list.add(s.substring(i, i + k));
            } else {
                break;
            }
        }

        if (i < s.length()) {
            StringBuilder lastWord = new StringBuilder(s.substring(i, s.length()));

            while (lastWord.length() < k) {
                lastWord.append(fill);
            }

            list.add(lastWord.toString());
        }

        String[] divideString = new String[list.size()];
        i = 0;

        for (String ss : list) {
            divideString[i++] = ss;
        }

        return divideString;

    }
}