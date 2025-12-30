class Solution {
    public int mostWordsFound(String[] sentences) {
        int mostWordsFound = 0;

        for (String sentence : sentences) {
            String[] wordArray = sentence.split(" ");
            if (wordArray.length > mostWordsFound)
                mostWordsFound = wordArray.length;
        }
        return mostWordsFound;
    }
}