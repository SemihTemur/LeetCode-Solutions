class Solution {
    public String sortSentence(String s) {
        String[] word = s.split(" ");
        String[] sortSentenceArray = new String[word.length];
        int length = word.length,i=0,j=0;

        for(i=0;i<length;i++){
            StringBuilder sb = new StringBuilder();
            for(j=0;j<word[i].length()-1;j++){
                sb.append(word[i].charAt(j));
            }
            int index = word[i].charAt(word[i].length()-1) - '0';
            sortSentenceArray[--index] = sb.toString(); 
        }

        

        return  String.join(" ",sortSentenceArray);
    }
}