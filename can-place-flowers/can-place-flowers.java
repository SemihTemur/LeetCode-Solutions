class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;

         if (flowerbed.length == 1 && flowerbed[0] == 0)
             return 1 >= n ? true : false;

         else if (flowerbed.length == 1 && flowerbed[0] == 1)
             return 0 == n ? true : false;

        // if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
        //     flowerbed[flowerbed.length - 1] = 1;
        //     count++;
        // }
        // if (flowerbed[0] == 0 && flowerbed[1] == 0) {
        //     flowerbed[0] = 1;
        //     count++;
        // }

        for (i = 0; i <= flowerbed.length - 1; i++) {
            if (i != 0 && i != flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0
                    && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                count++;
            }
            else if(i==0 && i+1!=flowerbed.length && flowerbed[i] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                count++;
            }

            else if(i==flowerbed.length-1 && i-1>-1&& flowerbed[i] == 0 && flowerbed[i-1] == 0){
                flowerbed[i] = 1;
                count++;
            }

        }

        return count >= n ? true : false;
    }
}