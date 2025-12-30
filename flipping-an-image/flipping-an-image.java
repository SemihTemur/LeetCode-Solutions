class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int i = 0;
        int j = image.length - 1;
        for (i = 0; i < image.length; i++) {
            int k = 0;
            while (k < j) {
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j--;
                k++;
            }
            j = j = image.length - 1;
        }
        for (i = 0; i < image.length; i++) {
            for (j = 0; j < image.length; j++) {
                if (image[i][j] == 0)
                    image[i][j] = 1;
                else
                    image[i][j] = 0;
            }
        }

        return image;
    }
}