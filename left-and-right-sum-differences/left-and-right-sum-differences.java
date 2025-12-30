class Solution {
    public int[] leftRightDifference(int[] nums) {
        int i = 0, j = 0;
        int[] leftRightDifference = new int[nums.length];

        for (i = 0; i < nums.length; i++) {
            int left = i - 1;
            int leftSum = 0;
            int right = i + 1;
            int rightSum = 0;

            while (left!=-1 && left < i) {
                leftSum = leftSum + nums[left];
                left--;
            }
            while (right!=nums.length && right > i) {
                rightSum = rightSum + nums[right];
                right++;
            }
            leftRightDifference[i] = Math.abs(leftSum - rightSum);
            leftSum = 0;
            rightSum = 0;
        }
        return leftRightDifference;
    }
}