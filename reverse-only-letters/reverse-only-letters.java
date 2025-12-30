class Solution {
    public String reverseOnlyLetters(String s) {
        int i;
        char[] chars = s.toCharArray();
        int j = chars.length - 1;
        for (i = 0; i<=j;) {
            if (!Character.isLetter(chars[i])) {
                i++;
                continue;
            }  if (!Character.isLetter(chars[j])) {
                j--;
                continue;
            }
            
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;
            i++;
            j--;
        }
        String newString = new String(chars);
        return newString;
    }
}