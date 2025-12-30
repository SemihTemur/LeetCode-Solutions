class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        if (digitSum(n) <= target) return 0;

        long result = 0;
        long multiplier = 1;

        while (digitSum(n) > target) {
            long digit = (n / multiplier) % 10;
            long toAdd = (10 - digit) % 10 * multiplier;

            result += toAdd;
            n += toAdd;
            multiplier *= 10;
        }

        return result;
    }

    private int digitSum(long num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
