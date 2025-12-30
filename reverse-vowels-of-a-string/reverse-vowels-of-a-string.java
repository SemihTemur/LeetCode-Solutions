class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] chars = s.toCharArray();

        while (i < j) {
            if (chars[i] != 'A' && chars[i] != 'E' && chars[i] != 'I' && chars[i] != 'O' && chars[i] != 'U' &&
                    chars[i] != 'a' && chars[i] != 'e' && chars[i] != 'i' && chars[i] != 'o' && chars[i] != 'u') {
                i++;
            } else if (chars[j] != 'A' && chars[j] != 'E' && chars[j] != 'I' && chars[j] != 'O' && chars[j] != 'U' &&
                    chars[j] != 'a' && chars[j] != 'e' && chars[j] != 'i' && chars[j] != 'o' && chars[j] != 'u') {
                j--;
            } else {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

                i++;
                j--;
            }
        }
        return new String(chars);
    }
}