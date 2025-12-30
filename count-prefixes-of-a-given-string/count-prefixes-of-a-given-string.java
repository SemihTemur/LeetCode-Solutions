class Solution {
    public int countPrefixes(String[] words, String s) {
        int countPrefixes = 0;

        for(String word:words){
            if(s.startsWith(word))
                countPrefixes++;
        }

        return countPrefixes;
    }
}