class Solution {
    public String reversePrefix(String s, int k) {
        int start = 0,end = k -1;
        char[] newString = s.toCharArray();

        while(start<end){
            char temp = newString[start];
            newString[start] = newString[end];
            newString[end] = temp;
            start++;
            end--;
        }

        return new String(newString);

    }
}