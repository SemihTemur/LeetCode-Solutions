class Solution {
    public boolean scoreBalance(String s) {
        int length = s.length();
        int left = 0, right = length - 1;
        char[] chars = s.toCharArray();

        int leftSum = chars[left++] - 'a' + 1;
        int rightSum = chars[right--] - 'a' + 1;

        while (left <= right) {
            if (leftSum > rightSum)
                rightSum = rightSum + (chars[right--] - 'a' + 1);
            else
                leftSum = leftSum + (chars[left++] - 'a' + 1);
        }

        return rightSum == leftSum ? true : false;

    }
}