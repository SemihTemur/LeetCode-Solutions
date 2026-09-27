class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        Character slowestKey = keysPressed.charAt(0);
        int i = 1;
        int max = releaseTimes[0];

        for (i = 1; i < releaseTimes.length; i++) {
            int account = releaseTimes[i] - releaseTimes[i - 1];

            if (max == account && slowestKey < keysPressed.charAt(i)) {
                slowestKey = keysPressed.charAt(i);
                max = account;
            }

            else if (max < account) {
                slowestKey = keysPressed.charAt(i);
                max = account;
            }
        }

        return slowestKey;

    }
}