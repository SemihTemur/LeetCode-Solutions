class Solution {
    public int countEven(int num) {
        int count = 0;
        int i, toplam=0;
        for (i = 2; i <= num; i++) {
            int temp = i;
            while (temp != 0) {
                toplam = toplam + temp % 10;
                temp = temp / 10;
                if (temp == 0) {
                    if (toplam % 2 == 0)
                        count++;
                    toplam = 0;
                }
            }
        }
        return count;
    }
}