class Solution {
    public boolean isPalindrome(int x) {
      int toplam = 0;
        int yedek = x;

        while (yedek>=1) {
            toplam = (toplam * 10) + yedek % 10;
            yedek = yedek / 10;
        }

        if (toplam == x) {
            return true;
        } else {
            return false;
        }

    }
}