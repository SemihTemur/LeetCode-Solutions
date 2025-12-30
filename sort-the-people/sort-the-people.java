class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int i = 0, j = 0;

        for (i = 0; i < names.length; i++) {
            for (j = i + 1; j < names.length; j++) {
                if (heights[i] < heights[j]) {
                    String tempS = names[i];
                    names[i] = names[j];
                    names[j] = tempS;

                    int tempN = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempN;
                }
            }
        }
        return names;
    }
}