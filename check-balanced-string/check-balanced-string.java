class Solution {
    public boolean isBalanced(String num) {
        int sumEvenNumber = 0;
        int sumOddNumber = 0;
        int i = 0;

        for (i = 0; i < num.length(); i++) {
            if (i % 2 == 0) {
                sumEvenNumber = sumEvenNumber + num.charAt(i) - '0';
            } else {
                sumOddNumber = sumOddNumber + num.charAt(i) - '0';
            }
        }

        return sumEvenNumber == sumOddNumber;
    }
}