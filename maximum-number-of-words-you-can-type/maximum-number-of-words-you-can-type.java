class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] textArray = text.split(" ");
        int i,count=0,flag=0;
        for(i=0;i<textArray.length;i++){
            String word = textArray[i];
            for(char c:brokenLetters.toCharArray())
                if(word.indexOf(c)!=-1)
                    flag=1;
            if(flag==0)
                count++;
            flag=0;
        }
        return count;
    }
}