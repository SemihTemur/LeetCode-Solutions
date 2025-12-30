class Solution {
    public int prefixCount(String[] words, String pref) {
        int prefLength = pref.length(), prefixCount = 0, i = 0;
        for (i = 0; i < words.length; i++) {
            if (words[i].length()>=prefLength && words[i].substring(0, prefLength).equals(pref))
                prefixCount++;
        }

        return prefixCount;
    }
}