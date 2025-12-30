class Solution {
    public int uniqueMorseRepresentations(String[] words) {
    String[] morseAlphabet = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                                       ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                                       "...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> uniqueMorseRepresentations = new HashSet();

        for(String s:words){
            StringBuilder sb = new StringBuilder();
            for(char c:s.toCharArray()){
                int index = c - 'a';
                sb.append(morseAlphabet[index]);
            }
            uniqueMorseRepresentations.add(sb.toString());
        }
        return uniqueMorseRepresentations.size();
    }
}