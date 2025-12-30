class Solution {
    public int[] decrypt(int[] code, int k) {
        if (k == 0)
            return new int[code.length];
        int i = 0, j = 0;
        int[] decrypt = new int[code.length];
        int direction = k > 0 ? 1 : -1;
        for (i = 0; i < code.length; i++) {
            int result = 0, temp = i + direction;
            for (j = 0; j < Math.abs(k); j++) {
                if (temp == code.length)
                    temp = 0;
                if (temp == -1)
                    temp = code.length - 1;
                result = result + code[temp];
                temp = temp + direction;
            }
            decrypt[i] = result;
        }
        return decrypt;
    }
}