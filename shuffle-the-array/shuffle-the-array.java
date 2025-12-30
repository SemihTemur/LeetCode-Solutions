class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[nums.length];
        int i = 0, j = nums.length / 2,k=0;
        while (i < nums.length) {
            if(i%2==1){
                shuffle[i] = nums[j];
                j++;
            }
            else{
                shuffle[i] = nums[k];
                k++;
            }
            i++;
        }

        return shuffle;
    }
}