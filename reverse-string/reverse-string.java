class Solution {
    public void reverseString(char[] s) {
        int size = s.length;
        int i, j = size - 1;
        for (i = 0; i < size/2; i++) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
        }
    }
}