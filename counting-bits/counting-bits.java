class Solution {
    public int[] countBits(int n) {
        int i = 0;
        int[] countBits = new int[n + 1];
        countBits[0] = 0;
        while (i <= n) {
            int temp = i;
            while (temp >= 1) {
                int remainig = temp % 2;
                temp = temp / 2;
                if (remainig == 1)
                    countBits[i]++;
                if (temp == 1) {
                    countBits[i]++;
                    break;
                }
            }
            i++;
        }
        return countBits;
    }
}