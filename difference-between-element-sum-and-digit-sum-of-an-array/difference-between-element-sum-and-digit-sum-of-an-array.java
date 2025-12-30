class Solution {
    public int differenceOfSum(int[] nums) {
        int sumNums = 0, digitSumNums = 0;
        int i=0;

        for(i=0;i<nums.length;i++){
            sumNums = sumNums+nums[i];
            int temp = nums[i];
            while(temp!=0){
                int digit = temp %10;
                digitSumNums = digitSumNums + digit;
                temp = temp /10;
            }
        }

        return Math.abs(sumNums-digitSumNums);

    }
}