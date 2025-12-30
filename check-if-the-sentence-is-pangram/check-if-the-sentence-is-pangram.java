class Solution {
    public boolean checkIfPangram(String sentence) {
        String englishalphabet = "abcdefghijklmnopqrstuvwxyz";

        for(char c:englishalphabet.toCharArray()){
            if(sentence.indexOf(c)==-1)
                return false;
        }
        return true;
    }
}