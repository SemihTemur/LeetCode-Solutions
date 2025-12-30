class Solution {
    public int sumOfSquares(int[] nums) {
        int sumOfSquares = 0;
        int length = nums.length;
        int i = 1;
        for(i=1;i<=length;i++){
            if(length%i==0)
                sumOfSquares = sumOfSquares + (nums[i-1] * nums[i-1]);
        }

        return sumOfSquares;
    }
}