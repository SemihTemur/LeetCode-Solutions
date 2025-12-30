class Solution {
    public String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        StringBuilder sb = new StringBuilder(); 
        int i=0;
        for(i=0;i<words.length;i++){
            String word = words[i].toLowerCase();
            int flag=0;
            String controlPlace = firstRow.indexOf(word.charAt(0))>-1 ? firstRow
                                : secondRow.indexOf(word.charAt(0))>-1 ? secondRow
                                : thirdRow.indexOf(word.charAt(0))>-1 ? thirdRow : "";
            for(char c:word.toCharArray()){
                if(controlPlace.indexOf(c)==-1){
                    flag=1;
                    break;
                }
            }
            if(flag==0 && i!=words.length-1)
                sb.append(words[i]+" ");
            else if(flag==0)
                sb.append(words[i]);
        }

        String[] findWords = sb.toString().contains(" ") ? sb.toString().split(" ") : sb.toString().length()>0 ? new String[]{sb.toString()} : new String[0];
        return findWords;
    }
}