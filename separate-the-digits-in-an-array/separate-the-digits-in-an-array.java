class Solution {
    public int[] separateDigits(int[] nums) {
        StringBuilder sb = new StringBuilder();

        for(int num:nums){
            sb.append(num);
        }

        String word = sb.toString();

        int[] separateDigits = new int[word.length()];
        int index = 0;

        for(char c:word.toCharArray()){
            separateDigits[index++] = c-'0';
        }

        return separateDigits;
    }
}