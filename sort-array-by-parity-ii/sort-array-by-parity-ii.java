class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int oddIndex = 1;
        int evenIndex = 0;
        int[] sortArrayByParityII = new int[nums.length];

        for (int num : nums) {
            if (num % 2 == 0) {
                sortArrayByParityII[evenIndex] = num;
                evenIndex = evenIndex + 2;
            }
            else{
                sortArrayByParityII[oddIndex] = num;
                oddIndex = oddIndex + 2;
            }
        }

        return sortArrayByParityII;
    }
}