class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch),i;
        if(index==-1)
            return word;

        char[] chars = word.toCharArray();
        
        for(i=0;i<=index/2;i++){
            int j = index-i;
            char temp = chars[index-i];
            chars[index-i] = chars[i];
            chars[i] = temp;
        }

        word = new String(chars);

        return word;
    }
}