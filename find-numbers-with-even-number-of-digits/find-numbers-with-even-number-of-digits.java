class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int temporary;
        int tempCount = 0;

        for (int i : nums) {
            temporary = i;
            while (temporary != 0) {
                temporary = temporary / 10;
                tempCount++;
                if (temporary == 0) {
                    if (tempCount % 2 == 0)
                        count++;
                    else
                        tempCount = 0;
                }
            }
        }
        return count;
    }
}