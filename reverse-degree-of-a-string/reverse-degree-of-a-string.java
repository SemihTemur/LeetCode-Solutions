class Solution {
    public int reverseDegree(String s) {
        int reverseDegree = 0, i = 0;
        char[] c = s.toCharArray();

        for (i = 0; i < c.length; i++) {
            reverseDegree = reverseDegree + (i + 1) *  (123 - (int) c[i]);
        }
        return reverseDegree;
    }
}