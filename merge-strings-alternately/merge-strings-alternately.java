class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();

        int lengthChar = length1+length2;
        int minLength = length1>length2 ? length2:length1;    

        char[] c = new char[lengthChar];
        int i = 0, j = 0;

        while(j<minLength){
            c[i++] = word1.charAt(j);
            c[i++] = word2.charAt(j++);
        }

        if(word1.length()==j && word2.length()!=j){
            while(j<word2.length()){
                c[i++] = word2.charAt(j++);
            }
        }
        else if(word2.length()==j && word1.length()!=j){
            while(j<word1.length()){
                c[i++] = word1.charAt(j++);
            }
        }

        return new String(c);

    }
}