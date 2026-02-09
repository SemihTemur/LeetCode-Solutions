class Solution {
    public String reversePrefix(String s, int k) {
        int length = s.length() + 1 ;
        int rotate = k % length;

        int i = 0;
        char[] newString = s.toCharArray();

        while(i<rotate-1){
            char temp = newString[i];
            newString[i] = newString[rotate-1];
            newString[rotate-1] = temp;
            i++;
            rotate--;
        }

        return new String(newString);

    }
}