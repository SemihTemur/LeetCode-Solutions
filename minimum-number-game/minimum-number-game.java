class Solution {
    public int[] numberGame(int[] nums) {
        int i = 0;
        int length = nums.length;
        int[] numberGame = new int[length];

        Arrays.sort(nums);

        while(i<length){
            numberGame[i] = nums[i+1];
            numberGame[i+1] = nums[i];
            i = i+2;
        }

        return numberGame;
    }
}