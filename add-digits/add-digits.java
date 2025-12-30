class Solution {
    public int addDigits(int num) {
        int remaining;
        int result = 0;
        while (num != 0) {
            remaining = num % 10;
            num = num / 10;
            result += remaining;
            if (result > 9 && num < 1) {
                num = result;
                result = 0;
            }
        }
        return result;
    }
}