class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder word1Sb = new StringBuilder();
        StringBuilder word2Sb = new StringBuilder();

        for(String word:word1)
            word1Sb.append(word);
        
        for(String word:word2)
            word2Sb.append(word);
        
        return word1Sb.toString().equals(word2Sb.toString());
    }
}